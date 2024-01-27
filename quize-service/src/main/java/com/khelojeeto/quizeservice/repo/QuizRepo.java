package com.khelojeeto.quizeservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khelojeeto.quizeservice.entity.Quiz;

public interface QuizRepo extends JpaRepository<Quiz, Integer> {

}
