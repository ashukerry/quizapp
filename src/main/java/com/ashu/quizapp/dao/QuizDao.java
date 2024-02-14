package com.ashu.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashu.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
