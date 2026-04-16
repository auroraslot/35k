(function () {
    var progressData = null;
    var currentUser = null;

    // 1. Check login status (synchronous)
    var xhr = new XMLHttpRequest();
    xhr.open('GET', '/api/auth/status', false);
    xhr.send();

    if (xhr.status === 200) {
        var statusResult = JSON.parse(xhr.responseText);
        if (!statusResult.data || !statusResult.data.loggedIn) {
            window.location.href = '/login.html';
            return;
        }
        currentUser = statusResult.data.username;
    } else {
        window.location.href = '/login.html';
        return;
    }

    // 2. Load progress data from backend (synchronous)
    xhr = new XMLHttpRequest();
    xhr.open('GET', '/api/progress', false);
    xhr.send();

    if (xhr.status === 200) {
        var progressResult = JSON.parse(xhr.responseText);
        progressData = progressResult.data || '{}';
    } else {
        progressData = '{}';
    }

    // 3. Override localStorage for the tracker key
    var originalGetItem = localStorage.getItem.bind(localStorage);
    var originalSetItem = localStorage.setItem.bind(localStorage);
    var originalRemoveItem = localStorage.removeItem.bind(localStorage);

    var STORAGE_KEY = 'leetcode-completed-problems';
    var saveTimer = null;

    localStorage.getItem = function (key) {
        if (key === STORAGE_KEY) {
            return progressData;
        }
        return originalGetItem(key);
    };

    localStorage.setItem = function (key, value) {
        if (key === STORAGE_KEY) {
            progressData = value;
            // Debounce: save to backend after 300ms of inactivity
            if (saveTimer) clearTimeout(saveTimer);
            saveTimer = setTimeout(function () {
                var saveXhr = new XMLHttpRequest();
                saveXhr.open('PUT', '/api/progress', true);
                saveXhr.setRequestHeader('Content-Type', 'application/json');
                saveXhr.send(JSON.stringify({data: value}));
            }, 300);
            return;
        }
        originalSetItem(key, value);
    };

    localStorage.removeItem = function (key) {
        if (key === STORAGE_KEY) {
            progressData = '{}';
            var saveXhr = new XMLHttpRequest();
            saveXhr.open('PUT', '/api/progress', true);
            saveXhr.setRequestHeader('Content-Type', 'application/json');
            saveXhr.send(JSON.stringify({data: '{}'}));
            return;
        }
        originalRemoveItem(key);
    };

    // 4. Inject user info bar when DOM is ready
    document.addEventListener('DOMContentLoaded', function () {
        var userBar = document.createElement('div');
        userBar.style.cssText = 'position:fixed;top:0;left:0;right:0;z-index:9999;' +
            'background:rgba(0,0,0,0.75);color:#fff;padding:6px 20px;' +
            'font-size:13px;display:flex;justify-content:space-between;align-items:center;' +
            'backdrop-filter:blur(8px);';
        userBar.innerHTML =
            '<span>\u5F53\u524D\u7528\u6237\uFF1A<strong>' + currentUser + '</strong></span>' +
            '<a id="logout-btn" href="#" style="color:#ffc107;text-decoration:none;">\u9000\u51FA\u767B\u5F55</a>';
        document.body.insertBefore(userBar, document.body.firstChild);
        document.body.style.paddingTop = '36px';

        document.getElementById('logout-btn').addEventListener('click', function (e) {
            e.preventDefault();
            var logoutXhr = new XMLHttpRequest();
            logoutXhr.open('POST', '/api/auth/logout', true);
            logoutXhr.onload = function () {
                window.location.href = '/login.html';
            };
            logoutXhr.send();
        });
    });
})();
