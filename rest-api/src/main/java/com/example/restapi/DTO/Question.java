package com.example.restapi.DTO;

import org.antlr.v4.runtime.misc.NotNull;

import com.example.restapi.DTO.Category;

import jakarta.annotation.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "questions")
public class Question {

	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long questionId;
    private String question;
    private String answer;
    @Column(name = "question_values")
    private long value;
    private String airdate;
    private String created_at;
    private String updated_at;
    private long game_id;
    private String invalid_count;
    
    @OneToOne
    @JoinColumn(name = "category_id",columnDefinition = "category_id")
    private Category category;
    
	public long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public long getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getAirdate() {
		return airdate;
	}
	public void setAirdate(String airdate) {
		this.airdate = airdate;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public long getGame_id() {
		return game_id;
	}
	public void setGame_id(long game_id) {
		this.game_id = game_id;
	}
	public String getInvalid_count() {
		return invalid_count;
	}
	public void setInvalid_count(String invalid_count) {
		this.invalid_count = invalid_count;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(long questionId, String question, String answer, long value, String airdate, String created_at,
			String updated_at, long game_id, String invalid_count ,Category category) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
		this.value = value;
		this.airdate = airdate;
		this.created_at = created_at;
		this.updated_at = updated_at;
		
		this.game_id = game_id;
		this.invalid_count = invalid_count;
		this.category = category;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", answer=" + answer + ", value="
				+ value + ", airdate=" + airdate + ", created_at=" + created_at + ", updated_at=" + updated_at
				+  ", game_id=" + game_id + ", invalid_count=" + invalid_count
				+ ", category=" + "category" + "]";
	}
    
    

    
    


    // Constructors, getters, and setters
    
}









