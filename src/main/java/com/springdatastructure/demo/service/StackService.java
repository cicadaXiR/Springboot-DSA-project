package com.springdatastructure.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springdatastructure.demo.model.Stack;
import com.springdatastructure.demo.repository.StackRepository;

@Service
public class StackService {
	private List<Integer> stack = new ArrayList<>();
	@Autowired
	private StackRepository stackrepo;
	public void push(int item) 
	{
		Stack newStack = new Stack();
		
		newStack.setValue(item);
		stackrepo.save(newStack);
		
		stack.add(item);	
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new IllegalStateException("Stack is Empty");
		}
		Stack element = stackrepo.findTopByOrderByIdDesc();
		stackrepo.delete(element);
		
		int lastIndex = size()-1;
		return stack.remove(lastIndex);
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new IllegalStateException("Stack is Empty");
		}
		return stack.get(stack.size()-1);
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public int size() {
		return stack.size();
	}
}
