package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";
    private static List<String[]> listOfStartCitiesAndDestinations = new ArrayList<>();
    private static List<String> listOfCities = new ArrayList<>();
    private static Map<String, List<String>> mapOfStartCitiesAndDestinations = new HashMap<>();

    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner in = new Scanner(System.in);

        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> lines = Files.readAllLines(path, charset);

        setCityPairs(lines);
        setListOfCities();
        setMapOfStartCitiesAndDestinations();

        while (true) {
            System.out.println("What would you like to do:\nTo display list of the cities press 1\nTo exit program press #");
            String userInput = in.nextLine();
            if (!userInput.equals("1") && !userInput.equals("#")) {
                System.out.println("Invalid input, try again...\n");
                continue;
            } else if (userInput.equals("1")) {
                System.out.println(listOfCities);
                System.out.println("Enter the name of the city you want to travel from:");
                userInput = in.nextLine();
                processUserInput(userInput, in);
            } else {
                break;
            }
        }
    }

    private static void setCityPairs(List<String> textLines) {
        for (String line : textLines) {
            String[] startCityAndDestination = line.split(" -> ");
            listOfStartCitiesAndDestinations.add(startCityAndDestination);
        }
    }

    private static void setListOfCities() {
        for (String[] cities : listOfStartCitiesAndDestinations) {
            if (!listOfCities.contains(cities[0])) {
                listOfCities.add(cities[0]);
            }
        }
    }

    private static void setMapOfStartCitiesAndDestinations() {
        for (String listOfCity : listOfCities) {
            List<String> destinations = new ArrayList<>();
            for (int j = 0; j < listOfStartCitiesAndDestinations.size(); j++) {
                if (listOfCity.equals(listOfStartCitiesAndDestinations.get(j)[0])) {
                    destinations.add(listOfStartCitiesAndDestinations.get(j)[1]);
                    mapOfStartCitiesAndDestinations.put(listOfCity, destinations);
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
            System.out.println(mapOfStartCitiesAndDestinations.get(cityToTravelFrom)
                    + "\nEnter the name of the city you want to travel from:");
            cityToTravelFrom = in.nextLine();
        }
    }

}


