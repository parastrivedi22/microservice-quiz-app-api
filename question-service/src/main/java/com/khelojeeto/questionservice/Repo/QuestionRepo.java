package com.khelojeeto.questionservice.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khelojeeto.questionservice.entity.Question;

public interface QuestionRepo extends JpaRepository<Question, Integer> {

	List<Question> findByQuizId(Integer quizId);
}
