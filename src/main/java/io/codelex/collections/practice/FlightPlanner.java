package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset CHARSET = Charset.defaultCharset();
    private static final String FILE = "/collections/flights.txt";
    private static final List<String[]> LIST_OF_START_CITIES_AND_DESTINATIONS = new ArrayList<>();
    private static final List<String> LIST_OF_CITIES = new ArrayList<>();
    private static final Map<String, List<String>> START_CITIES_AND_DESTINATIONS = new HashMap<>();

    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner in = new Scanner(System.in);

        final Path path = Paths.get(Histogram.class.getResource(FILE).toURI());
        List<String> lines = Files.readAllLines(path, CHARSET);

        setCityPairs(lines);
        setListOfCities();
        setMapOfStartCitiesAndDestinations();

        while (true) {
            System.out.println("What would you like to do:\nTo display list of the cities press 1\nTo exit program press #");
            String userInput = in.nextLine();
            if (!isValidInput(userInput)) {
                System.out.println("Invalid input, try again...\n");
                continue;
            } else if (userInput.equals("1")) {
                System.out.println(LIST_OF_CITIES);
                System.out.println("Enter the name of the city you want to travel from:");
                userInput = in.nextLine();
                processUserInput(userInput, in);
            } else {
                break;
            }
        }
    }

    private static boolean isValidInput(String input) {
        return input.equals("1") || input.equals("#");
    }

    private static void setCityPairs(List<String> textLines) {
        for (String line : textLines) {
            String[] startCityAndDestination = line.split(" -> ");
            LIST_OF_START_CITIES_AND_DESTINATIONS.add(startCityAndDestination);
        }
    }

    private static void setListOfCities() {
        for (String[] cities : LIST_OF_START_CITIES_AND_DESTINATIONS) {
            if (!LIST_OF_CITIES.contains(cities[0])) {
                LIST_OF_CITIES.add(cities[0]);
            }
        }
    }

    private static void setMapOfStartCitiesAndDestinations() {
        for (String listOfCity : LIST_OF_CITIES) {
            List<String> destinations = new ArrayList<>();
            for (int j = 0; j < LIST_OF_START_CITIES_AND_DESTINATIONS.size(); j++) {
                if (listOfCity.equals(LIST_OF_START_CITIES_AND_DESTINATIONS.get(j)[0])) {
                    destinations.add(LIST_OF_START_CITIES_AND_DESTINATIONS.get(j)[1]);
                    START_CITIES_AND_DESTINATIONS.put(listOfCity, destinations);
                }
            }
        }
    }

    private static void processUserInput(String cityToTravelFrom, Scanner in) {
        ArrayList<String> route = new ArrayList<>();
        while (true) {
            if (route.size() > 0 && cityToTravelFrom.equals(route.get(0))) {
                route.add(cityToTravelFrom);
                System.out.println(route);
                break;
            }
            route.add(cityToTravelFrom);
            System.out.println(START_CITIES_AND_DESTINATIONS.get(cityToTravelFrom)
                    + "\nEnter the name of the city you want to travel from:");
            cityToTravelFrom = in.nextLine();
        }
    }

}


