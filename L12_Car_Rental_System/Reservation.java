package L12_Car_Rental_System;
import java.util.*;

import L12_Car_Rental_System.Product.*;

public class Reservation {
    int reservationId;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    Date dateBookedFrom;
    Date dateBookedTo;
    Long fromTimeStamp;
    Long toTimeStamp;
    Location pickUpLocation;
    Location dropLocation;
    ReservationType reservationType;
    ReservationStatus reservationStatus;
    Location location;


    public int createReservation(User user, Vehicle vehicle){
        reservationId = 1234;
        this.user = user;
        this.vehicle = vehicle;
        reservationType = ReservationType.DAILY;
        reservationStatus = ReservationStatus.SCHEDULED;

        return reservationId;
    }


    public void add(Reservation reservation) {
         
        
        }

}
