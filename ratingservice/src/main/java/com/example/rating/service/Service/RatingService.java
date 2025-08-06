package com.example.rating.service.Service;

import java.util.List;

import com.example.rating.service.Entity.Rating;

public interface RatingService {
	
	public Rating save(Rating rating);
	public List<Rating> getRatings();
	public List<Rating> getRatingsbyUserId(String Uid);
	public List<Rating> getRatingbyHotelId(String Hid);

}
