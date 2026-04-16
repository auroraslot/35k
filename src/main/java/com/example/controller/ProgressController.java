package com.example.controller;

import com.example.model.ApiResult;
import com.example.service.ProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
@RequestMapping("/api/progress")
public class ProgressController {

    @Autowired
    private ProgressService progressService;

    @GetMapping
    public ApiResult<String> getProgress(HttpSession session) {
        Long userId = (Long) session.getAttribute("userId");
        if (userId == null) {
            return ApiResult.error("未登录");
        }
        String data = progressService.getProgressData(userId);
        return ApiResult.success(data);
    }

    @PutMapping
    public ApiResult<Void> saveProgress(@RequestBody Map<String, String> body, HttpSession session) {
        Long userId = (Long) session.getAttribute("userId");
        if (userId == null) {
            return ApiResult.error("未登录");
        }
        String data = body.get("data");
        progressService.saveProgressData(userId, data);
        return ApiResult.success("保存成功", null);
    }
}
