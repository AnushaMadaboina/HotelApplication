package com.hotel.service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.service.Entity.Hotel;

@Repository
public interface HotelRepository  extends JpaRepository<Hotel, String>{

}
