

public class Movie {
    int movieId;
    String movieName;
    int movieDurationTime;

    public int getMovieId(){
        return movieId;
    }

    public void setMovieId(int movieId){
        this.movieId = movieId;
    }

    public String getMovieName(){
        return movieName;
    }

    public void setMovieName(String movieName){
        this.movieName = movieName;
    }

    public int getMovieDuration(int movieDurationTime){
        return movieDurationTime;
    }

    public void setMovieDuration(int movieDurationTime){
        this.movieDurationTime = movieDurationTime;
    }
}
