package com.khelojeeto.quizeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khelojeeto.quizeservice.entity.Quiz;
import com.khelojeeto.quizeservice.service.QuizeService;

@RestController
@RequestMapping("/quiz")
public class QuizController  {

	@Autowired
	private QuizeService quizeService;
	

	@PostMapping("/new-quiz")
	public Quiz createQuize(@RequestBody Quiz quiz) {
		return quizeService.newQuiz(quiz);
	}
	
	
	@GetMapping("/get/{id}")
	public Quiz getQuiz(@PathVariable Integer id) {
		return quizeService.quizById(id);
	}
}
