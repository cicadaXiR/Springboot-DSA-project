package com.springdatastructure.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springdatastructure.demo.model.Stack;

@Repository
public interface StackRepository extends JpaRepository<Stack,Long>{
	Stack findTopByOrderByIdDesc();
}
