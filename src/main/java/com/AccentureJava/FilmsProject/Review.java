package com.AccentureJava.FilmsProject;

import java.util.Date;

public class Review {
    private static int maxId;

    private int ReviewId;
    private Date createDate;
    private User author;
    private String reviewText;
    private double Rating;

    public Review(int reviewId, Date createDate, User author, String reviewText, double rating) {
        ReviewId = reviewId;
        this.createDate = createDate;
        this.author = author;
        this.reviewText = reviewText;
        Rating = rating;
    }

    public int getReviewId() {
        return ReviewId;
    }

    public Review() {
        ReviewId = maxId+1;
        maxId++;
    }
}
