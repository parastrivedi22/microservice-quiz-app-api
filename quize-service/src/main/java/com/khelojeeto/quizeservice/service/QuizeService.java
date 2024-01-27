package com.khelojeeto.quizeservice.service;

import com.khelojeeto.quizeservice.entity.Quiz;

public interface QuizeService {

	public Quiz newQuiz(Quiz quiz);
	public Quiz quizById(Integer id);
	
}
