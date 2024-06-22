package com.in28minutes.rest.webservices.restful.web.services.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	
	@DeleteMapping("/users/{username}/todos/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable("username") String username,@PathVariable("id") long id) {
		Todo todo = todoService.deleteById(id);
		if(todo != null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
	}
	@GetMapping("/users/{username}/todos/{id}")
	public Todo getTodoById(@PathVariable("username") String username,@PathVariable("id") long id) {
		return todoService.findById(id);
	}
}
