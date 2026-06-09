import java.util.*;
import Enums.City;

public class TheaterController {
    Map<City, List<Theater>> cityVSTheater;
    List<Theater> allTheater;

    TheaterController() {
        cityVSTheater = new HashMap<>();
        allTheater = new ArrayList<>();
    }

    void addTheater(Theater theater, City city) {
        allTheater.add(theater);
        List<Theater> theaters = cityVSTheater.getOrDefault(city, new ArrayList<>());
        theaters.add(theater);
        cityVSTheater.put(city, theaters);
    }

    Map<Theater, List<Show>> getAllShow(Movie movie, City city) {
        Map<Theater, List<Show>> theaterVsShows = new HashMap<>();
        List<Theater> theaters = cityVSTheater.getOrDefault(city, new ArrayList<>());

        for(Theater theater : theaters) {
            List<Show> givenMovieShows = new ArrayList<>();
            List<Show> shows = theater.getShow();
            for(Show show : shows) {
                if(show.getMovie().getMovieId() == movie.getMovieId()) {
                    givenMovieShows.add(show);
                }
            }
            if(!givenMovieShows.isEmpty()) {
                theaterVsShows.put(theater, givenMovieShows);
            }
        }
        return theaterVsShows;
    }
}
