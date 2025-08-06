package com.example.rating.service.Controller;

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

import com.example.rating.service.Entity.Rating;
import com.example.rating.service.Service.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {
	@Autowired
	RatingService service;
	
	@PostMapping("/save")
	public ResponseEntity<Rating> create(@RequestBody Rating rating){
		return new ResponseEntity<Rating>(service.save(rating),HttpStatus.CREATED);
	}
	@GetMapping("/getAll")
	public ResponseEntity<List<Rating>> getRatings(){
		return new ResponseEntity<List<Rating>>(service.getRatings(),HttpStatus.OK);
	}
	@GetMapping("/users/{uid}")
	public ResponseEntity<List<Rating>> getRatingsbyUid(@PathVariable String uid){
		return new ResponseEntity<List<Rating>>(service.getRatingsbyUserId(uid),HttpStatus.OK);
	}
	@GetMapping("/hotel/{Hid}")
	public ResponseEntity<List<Rating>> getRatingsbyHid(@PathVariable String Hid){
		return new ResponseEntity<List<Rating>>(service.getRatingbyHotelId(Hid),HttpStatus.OK);
	}
}
