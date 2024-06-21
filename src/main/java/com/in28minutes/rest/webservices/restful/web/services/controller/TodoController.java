package com.in28minutes.rest.webservices.restful.web.services.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.webservices.restful.web.services.model.Todo;
import com.in28minutes.rest.webservices.restful.web.services.service.TodoHardCodedService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class TodoController {
	@Autowired
	private TodoHardCodedService todoService;
	
	@GetMapping("/user/{username}/todos")
	public List<Todo> getAllTodos(@PathVariable String username){
		return this.todoService.findAll();
	}
	
}
