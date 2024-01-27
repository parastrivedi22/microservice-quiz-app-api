package com.khelojeeto.questionservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khelojeeto.questionservice.Repo.QuestionRepo;
import com.khelojeeto.questionservice.entity.Question;
import com.khelojeeto.questionservice.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionRepo questionRepo;

	@Override
	public Question getById(Integer id) {
		// TODO Auto-generated method stub
		Question question = questionRepo.findById(id).orElseThrow(() -> new RuntimeException("Question No found"));

		return question;
	}

	@Override
	public Question newQuestion(Question question) {
		// TODO Auto-generated method stub
		Question save = questionRepo.save(question);
		return save;
	}

	@Override
	public List<Question> getAllQuestion() {
		return questionRepo.findAll();
		 
	}

	@Override
	public List<Question> getQuestionByQuizId(int quizId) {
		// TODO Auto-generated method 

		return questionRepo.findByQuizId(quizId);
		 
	}

}
