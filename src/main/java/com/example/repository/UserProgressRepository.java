package com.example.repository;

import com.example.entity.UserProgress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProgressRepository extends JpaRepository<UserProgress, Long> {

    UserProgress findByUserId(Long userId);
}
