package com.example.user.service.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.service.Entity.User;
import com.example.user.service.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping("/save")
	public ResponseEntity<User> save(@RequestBody User user){
		return new ResponseEntity<User>(service.saveUser(user),HttpStatus.CREATED);
	}
	@GetMapping("/get/{id}")
	public ResponseEntity<User> getUser(@PathVariable String id){
		return new ResponseEntity<User>(service.getUser(id),HttpStatus.OK);
	}
	@GetMapping("/getAll")
	public ResponseEntity<List<User>> getAll(){
		return new ResponseEntity<List<User>>(service.getAllUsers(),HttpStatus.OK);
	}
	
}
