package com.hotel.service.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Hotel_service")
public class Hotel {
	@Id
	String HotelId;
	String Hname;
	String location;
	String About;
	public String getHotelId() {
		return HotelId;
	}
	public void setHotelId(String hotelId) {
		HotelId = hotelId;
	}
	public String getHname() {
		return Hname;
	}
	public void setHname(String hname) {
		Hname = hname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAbout() {
		return About;
	}
	public void setAbout(String about) {
		About = about;
	}
	public Hotel(String hotelId, String hname, String location, String about) {
		super();
		HotelId = hotelId;
		Hname = hname;
		this.location = location;
		About = about;
	}
	public Hotel() {
		super();
	}
	@Override
	public String toString() {
		return "Hotel [HotelId=" + HotelId + ", Hname=" + Hname + ", location=" + location + ", About=" + About + "]";
	}
	
}
