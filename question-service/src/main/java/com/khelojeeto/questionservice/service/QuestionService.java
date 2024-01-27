package com.khelojeeto.questionservice.service;

import java.util.List;

import com.khelojeeto.questionservice.entity.Question;

public interface QuestionService {

	public Question getById(Integer id);
	public Question newQuestion(Question question);
	public List<Question> getAllQuestion();
	public List<Question>getQuestionByQuizId(int quizId);
}
