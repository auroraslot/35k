package com.example.service;

import com.example.entity.UserProgress;
import com.example.repository.UserProgressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgressService {

    @Autowired
    private UserProgressRepository userProgressRepository;

    public String getProgressData(Long userId) {
        UserProgress progress = userProgressRepository.findByUserId(userId);
        if (progress == null) {
            return "{}";
        }
        return progress.getProgressData() != null ? progress.getProgressData() : "{}";
    }

    public void saveProgressData(Long userId, String data) {
        UserProgress progress = userProgressRepository.findByUserId(userId);
        if (progress == null) {
            progress = new UserProgress();
            progress.setUserId(userId);
        }
        progress.setProgressData(data);
        userProgressRepository.save(progress);
    }
}
