package L12_Car_Rental_System;
import java.util.*;

import L12_Car_Rental_System.Product.*;

public class Store {
    int storeId;
    VehicleInventoryManagement inventoryManagement;
    Location storeLocation;
    List<Reservation> reservations = new ArrayList<>();

    public List<Vehicle> getVehicles(VehicleType vehicleType){
        if(inventoryManagement == null){
            return new ArrayList<>();
        }

        List<Vehicle> filteredVehicles = new ArrayList<>();
        for(Vehicle vehicle : inventoryManagement.getVehicles()){
            if(vehicle.getVehicleType() == vehicleType && vehicle.getStatus() == Status.AVAILABLE){
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    public void setVehicles(List<Vehicle> vehicles){
        inventoryManagement = new VehicleInventoryManagement(vehicles);
    }

    public void setStoreLocation(Location storeLocation){
        this.storeLocation = storeLocation;
    }

    public Reservation createReservation(Vehicle vehicle, User user){
        Reservation reservation = new Reservation();
        reservation.createReservation(user,vehicle);
        reservations.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationId){
        for(Reservation reservation : reservations){
            if(reservation.reservationId == reservationId){
                reservation.completeReservation();
                return true;
            }
        }
        return false;
    }
}
