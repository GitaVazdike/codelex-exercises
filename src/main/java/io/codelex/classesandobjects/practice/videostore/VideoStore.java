package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;

public class VideoStore {

    private ArrayList<Video> videos = new ArrayList<>();

    public void addVideo(String title) {
        videos.add(new Video(title));
    }

    public void checkOutVideo(String title) {
        for (Video video : videos) {
            if (video.getTitle().equals(title)) {
                video.isCheckedOut();
            }
        }
    }

    public void returnVideo(String title) {
        for (Video video : videos) {
            if (video.getTitle().equals(title)) {
                video.isReturned();
            }
        }
    }

    public void acceptUsersRating(String title, int rating) {
        for (Video video : videos) {
            if (video.getTitle().equals(title)) {
                video.setRating(rating);
            }
        }
    }

    public void listInventory() {
        for (Video video : videos) {
            System.out.println("Title: " + video.getTitle() + "; Available: " +
                    !video.getCheckedOut() + "; User rating: " + video.getAverageUsersRating());
        }
    }
}