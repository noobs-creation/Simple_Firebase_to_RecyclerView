package com.sem6.recyclertrial;

public class Blog {
    private String details;
    private String image;

    public Blog(String details, String image) {
        this.details = details;
        this.image = image;
    }

    public Blog() {
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
