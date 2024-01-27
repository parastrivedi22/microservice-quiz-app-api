package com.khelojeeto.quizeservice.entity;

import java.util.List;

import com.khelojeeto.quizeservice.pojo.Question;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Quiz {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String quizName;
	private transient List<Question> questions;
}

