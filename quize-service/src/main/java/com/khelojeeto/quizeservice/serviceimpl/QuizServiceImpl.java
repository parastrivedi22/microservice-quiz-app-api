package com.khelojeeto.quizeservice.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khelojeeto.quizeservice.entity.Quiz;
import com.khelojeeto.quizeservice.pojo.Question;
import com.khelojeeto.quizeservice.repo.QuizRepo;
import com.khelojeeto.quizeservice.service.QuestionClient;
import com.khelojeeto.quizeservice.service.QuizeService;

@Service
public class QuizServiceImpl implements QuizeService{

	@Autowired
	private QuizRepo quizRepo;
	
	@Autowired
	private QuestionClient questionClient;
	
	@Override
	public Quiz newQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		Quiz save = quizRepo.save(quiz);
		
		return save;
	}

	@Override
	public Quiz quizById(Integer id) {
		// TODO Auto-generated method stub
		Quiz quiz = quizRepo.findById(id).orElseThrow(()-> new RuntimeException("Quize not found"));
		List<Question> questionByQuizId = questionClient.getQuestionByQuizId(quiz.getId());
		quiz.setQuestions(questionByQuizId);
		return quiz;
	}

}
