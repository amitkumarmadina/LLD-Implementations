
import java.util.*;

import Enums.City;
import Enums.SeatCategory;
 
class BookMyShow{

    MovieController movieController;
    TheaterController theaterController;

    BookMyShow(){
    movieController = new MovieController();
    theaterController = new TheaterController();
    }
public static void main(String args[]){
    BookMyShow bookMyShow = new BookMyShow();

 bookMyShow.initialize();
 bookMyShow.createBooking(City.Banglore, "AVENGER");
 bookMyShow.createBooking(City.Banglore, "AVENGER");
}

private void createBooking(City userCity, String movieName){

    List<Movie> movies = movieController.getMovieByCity(userCity);

    Movie interestedMovie = null;
    for(Movie movie : movies){
        if(movie.getMovieName().equals(movieName)){
            interestedMovie = movie;
            break;
        }
    }

    if(interestedMovie == null){
        System.out.println("Movie is not available in selected city");
        return;
    }

    Map<Theater, List<Show>> showTheaterWise = theaterController.getAllShow(interestedMovie, userCity);
    if(showTheaterWise.isEmpty()){
        System.out.println("No shows available for selected movie");
        return;
    }

    Map.Entry<Theater, List<Show>> entry = showTheaterWise.entrySet().iterator().next();

    List<Show> runningShows = entry.getValue();
    Show interestedShow = runningShows.get(0);
    int seatNumber = 30;
    List<Integer> bookedSeats = interestedShow.getBookedSeatIds();

    if(!bookedSeats.contains(seatNumber)){
        bookedSeats.add(seatNumber);
        Booking booking = new Booking();
        List<Seat> myBookedSeats = new ArrayList<>();
        for(Seat screenSeat : interestedShow.getScreen().getSeats()){
            if(screenSeat.getSeatId() == seatNumber){
                myBookedSeats.add(screenSeat);
            }
        }
        
        booking.setBookedSeats(myBookedSeats);
        booking.setShow(interestedShow);
    }else{
        System.out.println("Seat already booked, try again later");
        return;
    }
    System.out.println("BOOKING CONFIRMED");
}
    private void initialize(){
        createMovies();
        createTheater();
    }

    private List<Seat> createSeats(){
        List<Seat> seats = new ArrayList<>();
        for(int i = 0; i <= 40 ; i++){
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.SILVER);
            seats.add(seat);
        }

        for(int i = 41; i <= 80 ; i++){
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.GOLD);
            seats.add(seat);
        }

        for(int i = 81; i <= 100 ; i++){
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.PLATINUM);
            seats.add(seat);
        }


        return seats;
    }


     private List<Screen> createScreens(){
        List<Screen> screens = new ArrayList<>();
        Screen screen1 = new Screen();
        screen1.setScreenId(1);
        screen1.setSeats(createSeats());
        screens.add(screen1);
        return screens;
    }


    private void createMovies(){
    Movie avenger = new Movie();
    avenger.setMovieId(1);
    avenger.setMovieName("AVENGER");
    avenger.setMovieDuration(128);

    Movie dhurandhar = new Movie();
    dhurandhar.setMovieId(2);
    dhurandhar.setMovieName("DHURANDHAR");
    dhurandhar.setMovieDuration(180);

    movieController.addMovies(avenger, City.Banglore);
    movieController.addMovies(dhurandhar, City.Banglore);
    movieController.addMovies(avenger, City.Delhi);
    movieController.addMovies(dhurandhar, City.Delhi);
    }

    private void createTheater(){
        Movie avengerMovie = movieController.getMovieByName("AVENGER");
        Movie dhurandharMovie = movieController.getMovieByName("DHURANDHAR");

        Theater inoxTheater = new Theater();
        inoxTheater.setTheaterId(1);
        inoxTheater.setScreen(createScreens());
        inoxTheater.setCity(City.Banglore);
        List<Show> inoxShows = new ArrayList<>();
        Show inoxMorningShow = createShows(1, inoxTheater.getScreen().get(0), avengerMovie, 8);
        Show inoxEveningShow = createShows(2, inoxTheater.getScreen().get(0), dhurandharMovie, 16);
        inoxShows.add(inoxMorningShow);
        inoxShows.add(inoxEveningShow);
        inoxTheater.setShow(inoxShows);

        Theater pvrTheater = new Theater();
        pvrTheater.setTheaterId(2);
        pvrTheater.setScreen(createScreens());
        pvrTheater.setCity(City.Delhi);
        List<Show> pvrShows = new ArrayList<>();
        Show pvrMorningShow1 = createShows(1, inoxTheater.getScreen().get(0), avengerMovie, 8);
        Show pvrEveningShow1 = createShows(2, inoxTheater.getScreen().get(0), dhurandharMovie, 16);
        inoxShows.add(pvrMorningShow1);
        pvrShows.add(pvrEveningShow1);
        pvrTheater.setShow(pvrShows);

        theaterController.addTheater(inoxTheater, City.Banglore);
        theaterController.addTheater(pvrTheater, City.Delhi);
    }

    private Show createShows(int showId, Screen screen, Movie movie, int showStartTime){
        Show show = new Show();
        show.setShowId(showId);    
        show.setScreen(screen);
        show.setMovie(movie);
        show.setShowStartingTime(showStartTime);
        return show;
    }

}
