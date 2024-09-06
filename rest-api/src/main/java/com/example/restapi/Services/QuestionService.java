package com.example.restapi.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.restapi.DTO.NextQuestionResponseDto;
import com.example.restapi.DTO.Question;
import com.example.restapi.Repository.QuestionRepository;

@Service
public class QuestionService {

    private static final String RANDOM_QUESTIONS_API = "https://jservice.io/api/random";

    @Autowired
    private QuestionRepository questionRepository;

    public Question getNextQuestion() {
        Question question = fetchRandomQuestion();
        questionRepository.save(question);
        return question;
    }

    public NextQuestionResponseDto checkAnswerAndGetNextQuestion(Question question) {
        Question questionDto1 = fetchRandomQuestion();
        Optional<Question> currentQuestion = questionRepository.findById(questionDto1.getQuestionId());

        NextQuestionResponseDto responseDto = new NextQuestionResponseDto();
        responseDto.setNextQuestion(questionDto1);

        return responseDto;
    }

    private Question fetchRandomQuestion() {
        RestTemplate restTemplate = new RestTemplate();
        Question questions[] = restTemplate.getForObject(RANDOM_QUESTIONS_API, Question[].class);

        if (questions != null ) {
            return questions[0];
        }

        throw new RuntimeException("Failed to fetch a random question.");
    }
}

