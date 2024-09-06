package com.example.restapi.DTO;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Category {

	@jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long category_id;
	private String title;
	private String created_at;
	private String updated_at;
	private int clues_count;
	
	public long getId() {
		return category_id;
	}
	public void setId(long category_id) {
		this.category_id = category_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public int getClues_count() {
		return clues_count;
	}
	public void setClues_count(int clues_count) {
		this.clues_count = clues_count;
	}
	public Category(long category_id, String title, String created_at, String updated_at, int clues_count) {
		super();
		this.category_id = category_id;
		this.title = title;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.clues_count = clues_count;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Category [category_id=" + category_id + ", title=" + title + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ ", clues_count=" + clues_count + "]";
	}
	
	
}
