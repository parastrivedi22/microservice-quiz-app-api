package com.khelojeeto.questionservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khelojeeto.questionservice.entity.Question;
import com.khelojeeto.questionservice.service.QuestionService;

@RestController
@RequestMapping("/question")

public class QuestionController {

	@Autowired
	private QuestionService questionService;
	
	@PostMapping("/new")
	public Question createQuestion(@RequestBody Question question) {
		return this.questionService.newQuestion(question);
	}
	
	
	@GetMapping("/question/{id}")
	public Question getById(@PathVariable int id) {
		return this.questionService.getById(id);
	}
	
	
	
	@GetMapping("/quiz/{quizId}")
	public List<Question> getQuestionByQuizId(@PathVariable Integer quizId) {
		return this.questionService.getQuestionByQuizId(quizId);
	}
	
	
	@GetMapping
	public List<Question> getAllQuestions() {
		return this.questionService.getAllQuestion();
	}
	
	
}
