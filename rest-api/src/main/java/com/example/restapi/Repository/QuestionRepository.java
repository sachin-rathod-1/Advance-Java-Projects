package com.example.restapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.restapi.DTO.*;
import com.example.restapi.DTO.Question;

public interface QuestionRepository extends CrudRepository<Question, Long>, JpaRepository<Question, Long> {

}
