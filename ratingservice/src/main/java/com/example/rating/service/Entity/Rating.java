package com.example.rating.service.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rating_service")
public class Rating {

    @Id
    private String ratingId;
    private String hotelId;
    private String userId;
    private int rating;
    private String feedback;

    public Rating() {
        // Default constructor
    }

    public Rating(String ratingId, String hotelId, String userId, int rating, String feedback) {
        this.ratingId = ratingId;
        this.hotelId = hotelId;
        this.userId = userId;
        this.rating = rating;
        this.feedback = feedback;
    }

    public String getRatingId() {
        return ratingId;
    }

    public void setRatingId(String ratingId) {
        this.ratingId = ratingId;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "Rating [ratingId=" + ratingId + ", hotelId=" + hotelId + ", userId=" + userId + ", rating=" + rating
                + ", feedback=" + feedback + "]";
    }
}
