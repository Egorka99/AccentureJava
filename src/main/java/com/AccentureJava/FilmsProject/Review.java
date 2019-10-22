package com.AccentureJava.FilmsProject;

import java.util.Date;

public class Review {
    private static int maxId;

    private int ReviewId;
    private Date createDate;
    private  Person author;
    private String reviewText;
    private double Rating;

    public Review( Date createDate, Person author, String reviewText, double rating) {
        this.createDate = createDate;
        this.author = author;
        this.reviewText = reviewText;
        Rating = rating;
        ReviewId = maxId+1;
        maxId++;
    }

    public int getReviewId() {
        return ReviewId;
    }
}
