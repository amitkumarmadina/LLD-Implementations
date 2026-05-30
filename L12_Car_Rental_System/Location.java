package L12_Car_Rental_System;

import java.util.Objects;

public class Location {
    int pin;
    String state;
    String city;
    String country;

    Location(int pin, String city, String state, String country){
        this.city = city;
        this.country = country;
        this.pin = pin;
        this.state = state;
    }

    public int getPin(){
        return pin;
    }

    public String getCity(){
        return city;
    }

    public String getState(){
        return state;
    }

    public String getCountry(){
        return country;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Location)){
            return false;
        }
        Location other = (Location) obj;
        return pin == other.pin
                && Objects.equals(city, other.city)
                && Objects.equals(state, other.state)
                && Objects.equals(country, other.country);
    }

    @Override
    public int hashCode(){
        return Objects.hash(pin, city, state, country);
    }
}
