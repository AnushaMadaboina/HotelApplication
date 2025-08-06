package com.hotel.service.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hotel.service.Entity.Hotel;

@Service
public interface HotelService {
	public Hotel save(Hotel hotel);
	public Hotel getbyId(String id);
	public List<Hotel> getAll();
}
