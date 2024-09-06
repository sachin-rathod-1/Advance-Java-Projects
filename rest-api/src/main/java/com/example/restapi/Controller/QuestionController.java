package com.example.restapi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.example.restapi.DTO.NextQuestionResponseDto;
import com.example.restapi.DTO.Question;
import com.example.restapi.Services.QuestionService;

@RestController
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/play")
    public Question play() {
        return questionService.getNextQuestion();
    }

    @PostMapping("/next")
    public NextQuestionResponseDto next(@RequestBody Question question) {
        return questionService.checkAnswerAndGetNextQuestion(question);
    }
}
