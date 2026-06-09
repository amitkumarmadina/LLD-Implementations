import java.util.*;
import Enums.City;

public class Theater {
    int theaterId;
    String Address;
    City city;
    List<Screen> screens = new ArrayList<>();
    List<Show> shows = new ArrayList<>();

    public int getTheaterId(){return theaterId;}

    public void setTheaterId(int id){this.theaterId = id;}

    public String getAddress(){return Address;}

    public void setAddress(String address){this.Address = address;}

    public List<Screen> getScreen(){return screens;}

    public void setScreen(List<Screen> screen){this.screens = screen;}
    
    public List<Show> getShow(){return shows;}

    public void setShow(List<Show> show){this.shows = show;}

    public City getCity(){return city;}
    public void setCity(City city){this.city = city;}

}
