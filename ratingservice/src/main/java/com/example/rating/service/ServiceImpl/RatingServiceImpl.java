package com.example.rating.service.ServiceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rating.service.Entity.Rating;
import com.example.rating.service.Repository.RatingRepository;
import com.example.rating.service.Service.RatingService;

@Service
public class RatingServiceImpl implements RatingService{
	
	@Autowired
	RatingRepository repo;

	@Override
	public Rating save(Rating rating) {
		// TODO Auto-generated method stub
		String UID=UUID.randomUUID().toString();
		rating.setRatingId(UID);
		return repo.save(rating);
	}

	@Override
	public List<Rating> getRatings() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Rating> getRatingsbyUserId(String Uid) {
		// TODO Auto-generated method stub
		return repo.findByUserId(Uid);
	}

	@Override
	public List<Rating> getRatingbyHotelId(String Hid) {
		// TODO Auto-generated method stub
		return repo.findByHotelId(Hid);
	}

}
