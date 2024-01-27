package com.khelojeeto.quizeservice.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Question {

	private int id;
	private String question;
	private int quizId;
}