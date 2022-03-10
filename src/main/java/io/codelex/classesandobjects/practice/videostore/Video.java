package io.codelex.classesandobjects.practice.videostore;

public class Video {
    private String title;
    private boolean checkedOut;
    private double averageUsersRating;
    private int sumOfRatings;
    private int userCount;


    public Video(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public boolean getCheckedOut() {
        return checkedOut;
    }

    public double getAverageUsersRating() {
        return averageUsersRating;
    }

    public void isCheckedOut() {
        this.checkedOut = true;
    }

    public void isReturned() {
        checkedOut = false;
    }

    public void setRating(int rating) {
        sumOfRatings += rating;
        userCount++;
        averageUsersRating = (double) sumOfRatings / userCount;
    }
}

