package com.hotel.service.Controller;

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

import com.hotel.service.Entity.Hotel;
import com.hotel.service.Service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {
	@Autowired
	HotelService service;
		@PostMapping("/save")
		public ResponseEntity<Hotel> save(@RequestBody Hotel hotel){
			return new ResponseEntity<Hotel>(service.save(hotel),HttpStatus.CREATED);
		}
		@GetMapping("/get/{id}")
		public ResponseEntity<Hotel> getUser(@PathVariable String id){
			return new ResponseEntity<Hotel>(service.getbyId(id),HttpStatus.CREATED);
		}
		@GetMapping("/getAll")
		public ResponseEntity<List<Hotel>> getAll(){
			return new ResponseEntity<List<Hotel>>(service.getAll(),HttpStatus.CREATED);
		}

	}

