package com.example.restapi.DTO;

public class NextQuestionResponseDto {

    private String correctAnswer;
    private Question nextQuestion;
    
    
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	public Question getNextQuestion() {
		return nextQuestion;
	}
	public void setNextQuestion(Question nextQuestion) {
		this.nextQuestion = nextQuestion;
	}
	public NextQuestionResponseDto(String correctAnswer, Question nextQuestion) {
		super();
		this.correctAnswer = correctAnswer;
		this.nextQuestion = nextQuestion;
	}
	@Override
	public String toString() {
		return "NextQuestionResponseDto [correctAnswer=" + correctAnswer + ", nextQuestion=" + nextQuestion + "]";
	}
	public NextQuestionResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

    // Constructors, getters, and setters
    
    
}
