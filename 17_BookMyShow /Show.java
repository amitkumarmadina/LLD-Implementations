 
import java.util.*;

public class Show {
    int showId;
    Movie movie;
    Screen screen;
    int showStartTime;
    List<Integer> bookSeatId = new ArrayList<>();

    public int getShowId(){
        return showId;
    }

    public void setShowId(int id){
        this.showId = id;
    } 

    public Movie getMovie(){
        return movie;
    }

    public void setMovie(Movie movie){
        this.movie = movie;
    } 

    public Screen getScreen(){
        return screen;
    }

    public void setScreen(Screen screen){
        this.screen = screen;
    }

    public void setShowStartingTime(int time){
        this.showStartTime = time;
    }

    public int getShowStartTime(){
        return showStartTime;
    }

    public List<Integer> getBookedSeatIds(){
        return bookSeatId;
    }

    public void seatBookedSeatIdx(List<Integer> bookedSeatIds){
        this.bookSeatId = bookedSeatIds;
    }
}
