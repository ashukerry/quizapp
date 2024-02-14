package com.ashu.quizapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashu.quizapp.model.Question;
import com.ashu.quizapp.service.QuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.*;

@RestController
@RequestMapping("question")

public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("allQuesttion")

    public ResponseEntity<List<Question>> getAllQuestion() {

        return questionService.getAllQuestions();

    }

    @GetMapping("category/{category}")
    // @GetMapping("category/{cat}")

    // @PathVariable("cat")

    public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable String category) {
        return questionService.getQuestionByCategory(category);
    }

    @PostMapping("add")

    public ResponseEntity<String> addQuestion(@RequestBody Question question) {

        return questionService.addQuestion(question);

    }

}
