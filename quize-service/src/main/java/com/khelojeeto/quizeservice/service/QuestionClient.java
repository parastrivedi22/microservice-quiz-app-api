package com.khelojeeto.quizeservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.khelojeeto.quizeservice.pojo.Question;

@FeignClient(url = "http://localhost:8082/question", value = "question-client")
//@FeignClient(name="QUESTION-SERVICE")
public interface QuestionClient {

	@GetMapping("/quiz/{quizId}")
	public List<Question> getQuestionByQuizId(@PathVariable Integer quizId);
}
