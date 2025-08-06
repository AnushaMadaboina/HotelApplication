package com.hotel.service.ServiceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.service.Entity.Hotel;
import com.hotel.service.Exception.ResourceNotFoundException;
import com.hotel.service.Repository.HotelRepository;
import com.hotel.service.Service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {
	@Autowired
	HotelRepository repo;

	@Override
	public Hotel save(Hotel hotel) {
		// TODO Auto-generated method stub
		String UID=UUID.randomUUID().toString();
		hotel.setHotelId(UID);
		return repo.save(hotel);
	}

	@Override
	public Hotel getbyId(String id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow(()->new ResourceNotFoundException("User id not found"+id));
	}

	@Override
	public List<Hotel> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
