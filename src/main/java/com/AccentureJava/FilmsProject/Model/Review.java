package com.AccentureJava.FilmsProject.Model;

import com.AccentureJava.FilmsProject.Model.Person;

import java.util.Date;

public class Review {
    private static int maxId;

    private int ReviewId;
    private Date createDate;
    private Person author;
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

    public Date getCreateDate() {
        return createDate;
    }

    public Person getAuthor() {
        return author;
    }

    public String getReviewText() {
        return reviewText;
    }

    public double getRating() {
        return Rating;
    }

    public int getReviewId() {
        return ReviewId;
    }
}
