package com.in28minutes.rest.webservices.restful.web.services.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.in28minutes.rest.webservices.restful.web.services.model.Todo;

@Service
public class TodoHardCodedService {
	private static List<Todo> todos = new ArrayList<>();
	private static int idCounter =0;
	static {
		todos.add(new Todo(++idCounter,"in28 minutes","Learn to dance",new Date(),false));
		todos.add(new Todo(++idCounter,"in28 minutes","Learn to Angular",new Date(),false));
		todos.add(new Todo(++idCounter,"denamwita","Learn about Angular",new Date(),false));
	
	}
	
		
	public List<Todo> findAll(){
		return this.todos;
	}
}
