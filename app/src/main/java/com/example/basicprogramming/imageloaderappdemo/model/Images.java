package com.example.basicprogramming.imageloaderappdemo.model;

public class Images {

    private String movieName;
    private String imageUrl;

    public Images(String movieName, String imageUrl) {
        this.movieName = movieName;
        this.imageUrl = imageUrl;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
