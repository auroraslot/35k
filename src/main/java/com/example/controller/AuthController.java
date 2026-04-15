package com.example.controller;

import com.example.entity.User;
import com.example.model.ApiResult;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ApiResult<Map<String, Object>> register(@RequestBody Map<String, String> body, HttpSession session) {
        try {
            String username = body.get("username");
            String password = body.get("password");
            User user = userService.register(username, password);

            session.setAttribute("userId", user.getId());
            session.setAttribute("username", user.getUsername());

            Map<String, Object> data = new HashMap<String, Object>();
            data.put("username", user.getUsername());
            return ApiResult.success("注册成功", data);
        } catch (RuntimeException e) {
            return ApiResult.error(e.getMessage());
        }
    }

    @PostMapping("/login")
    public ApiResult<Map<String, Object>> login(@RequestBody Map<String, String> body, HttpSession session) {
        try {
            String username = body.get("username");
            String password = body.get("password");
            User user = userService.login(username, password);

            session.setAttribute("userId", user.getId());
            session.setAttribute("username", user.getUsername());

            Map<String, Object> data = new HashMap<String, Object>();
            data.put("username", user.getUsername());
            return ApiResult.success("登录成功", data);
        } catch (RuntimeException e) {
            return ApiResult.error(e.getMessage());
        }
    }

    @PostMapping("/logout")
    public ApiResult<Void> logout(HttpSession session) {
        session.invalidate();
        return ApiResult.success("已退出登录", null);
    }

    @GetMapping("/status")
    public ApiResult<Map<String, Object>> status(HttpSession session) {
        Long userId = (Long) session.getAttribute("userId");
        String username = (String) session.getAttribute("username");

        Map<String, Object> data = new HashMap<String, Object>();
        if (userId != null) {
            data.put("loggedIn", true);
            data.put("username", username);
        } else {
            data.put("loggedIn", false);
        }
        return ApiResult.success(data);
    }
}
