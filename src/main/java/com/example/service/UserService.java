package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Base64;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User register(String username, String password) {
        if (userRepository.existsByUsername(username)) {
            throw new RuntimeException("用户名已存在");
        }
        if (username == null || username.trim().length() < 2) {
            throw new RuntimeException("用户名至少2个字符");
        }
        if (password == null || password.length() < 4) {
            throw new RuntimeException("密码至少4个字符");
        }

        String salt = generateSalt();
        String hashedPassword = hashPassword(password, salt);

        User user = new User();
        user.setUsername(username.trim());
        user.setPassword(hashedPassword);
        user.setSalt(salt);
        return userRepository.save(user);
    }

    public User login(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new RuntimeException("用户名或密码错误");
        }
        String hashedPassword = hashPassword(password, user.getSalt());
        if (!hashedPassword.equals(user.getPassword())) {
            throw new RuntimeException("用户名或密码错误");
        }
        return user;
    }

    private String generateSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return Base64.getEncoder().encodeToString(salt);
    }

    private String hashPassword(String password, String salt) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(salt.getBytes(StandardCharsets.UTF_8));
            byte[] hash = md.digest(password.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(hash);
        } catch (Exception e) {
            throw new RuntimeException("密码加密失败", e);
        }
    }
}
