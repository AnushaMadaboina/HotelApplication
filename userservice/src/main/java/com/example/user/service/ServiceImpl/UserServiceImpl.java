package com.example.user.service.ServiceImpl;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.user.service.Entity.Rating;
import com.example.user.service.Entity.User;
import com.example.user.service.Exception.ResourceNotFoundException;
import com.example.user.service.Repository.UserRepository;
import com.example.user.service.service.UserService;



@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepo;
	@Autowired
	RestTemplate template;
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	

	@Override
	public User saveUser(User user) {
		String ID=UUID.randomUUID().toString();
		user.setId(ID);
		return userRepo.save(user);
	}

	@Override
	public User getUser(String id) {
	    User user = userRepo.findById(id)
	        .orElseThrow(() -> new ResourceNotFoundException("User Id not found"));
	    ArrayList<Rating> ratings=template.getForObject("http://localhost:8083/ratings/users/"+user.getId(),ArrayList.class);
	    user.setRatings(ratings);

	    return user;
	}



	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		List<User> users=userRepo.findAll();
		for(User user:users) {
			    ArrayList<Rating> Allratings=template.getForObject("http://localhost:8083/ratings/users/"+user.getId(),ArrayList.class);
			    user.setRatings(Allratings);
		}
		
		return users;
	}
	

}
