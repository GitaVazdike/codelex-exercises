package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;
    private static VideoStore store = new VideoStore();

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to rate a video");
            System.out.println("Choose 5 to list all available videos");

            int n = keyboard.nextInt();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard);
                    break;
                case 2:
                    rentVideo(keyboard);
                    break;
                case 3:
                    returnVideo(keyboard);
                    break;
                case 4:
                    rateVideo(keyboard);
                    break;
                case 5:
                    listVideos(keyboard);
                    break;
                default:
                    break;
            }
        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String movieName = scanner.next();
            movieName += scanner.nextLine();
            System.out.println("Enter rating");
            int rating = scanner.nextInt();
            store.addVideo(movieName);
            store.acceptUsersRating(movieName, rating);
        }
    }

    private static void rentVideo(Scanner scanner) {
        System.out.println("Enter movie name you want to rent");
        String movieToRent = scanner.next();
        movieToRent += scanner.nextLine();
        store.checkOutVideo(movieToRent);
    }

    private static void returnVideo(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Enter movie name you want to return");
        String movieToReturn = scanner.next();
        movieToReturn += scanner.nextLine();
        store.returnVideo(movieToReturn);
    }

    private static void rateVideo(Scanner scanner) {
        System.out.println("Enter movie name you want to rate");
        String movieToRate = scanner.next();
        movieToRate += scanner.nextLine();
        System.out.println("Enter the rating");
        int rating = scanner.nextInt();
        store.acceptUsersRating(movieToRate, rating);
    }

    private static void listVideos(Scanner scanner) {
        System.out.println("All movies in videoStore: ");
        store.listInventory();
    }
}