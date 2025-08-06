package com.example.user.service.service;

import java.util.List;

import com.example.user.service.Entity.User;

public interface UserService {
	public User saveUser(User user);
	public User getUser(String id);
	public List<User> getAllUsers();
}
