import java.util.*;
import Enums.City;

public class MovieController {
    Map<City, List<Movie>> cityVsMovies;

    List<Movie> allMovies;

    MovieController(){
        cityVsMovies = new HashMap<>();
        allMovies = new ArrayList<>();
    }

    void addMovies(Movie movie, City city){
        allMovies.add(movie);
        List<Movie> movies = cityVsMovies.getOrDefault(city, new ArrayList<>());
        movies.add(movie);
        cityVsMovies.put(city, movies);
    }

    Movie getMovieByName(String movieName){
        
        for(Movie movie : allMovies){
            if(movie.getMovieName().equals(movieName)){
                return movie;
            }
        }
        return null;
    }

   static List<Movie> getMovieByCity(City cityName){
        
        return cityVsMovies.get(cityName);
    }


}   

