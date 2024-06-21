package com.in28minutes.rest.webservices.restful.web.services.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.webservices.restful.web.services.model.HelloWorldBean;


//Controller
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {
	@GetMapping(path="/hello-world")
	public ResponseEntity<String> helloWorld() {
		return new ResponseEntity<>("hello world",HttpStatus.OK);
	}
	
	@GetMapping(path="/hello-world/path-variable/{name}")
	public ResponseEntity<HelloWorldBean> helloWorldBean(@PathVariable String name) {
		//throw new RuntimeException("Some Error has happened! contact support!");
		return new ResponseEntity<>(new HelloWorldBean("Hello world"+ " "+ name), HttpStatus.OK);
	}
	
	//Retrieve all Todos for a user : GET /users/{user_name}/todos
	//delete a todo of a user : DELETE /users/{user_name}/todos/{todo_id}
	//edit a todo : PUT /users/{user_name}/todos/{todo_id}
	//create a new todo : POST /users/{user_name}/todos
}
