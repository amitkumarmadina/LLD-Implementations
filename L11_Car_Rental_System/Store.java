package L11_Car_Rental_System;
import java.util.*;

import L11_Car_Rental_System.Product.*;

public class Store {
    int storeId;
    VehicleInventoryManagement inventoryManagement;
    Location storeLocation;
    List<Reservation> Reservation = new ArrayList<>();

    public List<Vehicle> getVehicles(VehicleType vehicleType){
        return inventoryManagement.getVehicle();
    }

    public void setVehicles(List<Vehicle> vehicles){
        inventoryManagement = new VehicleInventoryManagement(vehicles);
    }

    public Reservation createReservation(Vehicle vehicle, User user){
        Reservation reservation = new Reservation();
        reservation.createReserve(user,vehicle);
        reservation.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationId){
        return true;
    }
}
