package L12_Car_Rental_System;

import java.util.*;

import L12_Car_Rental_System.Product.Vehicle;

public class VehicleInventoryManagement {
 List<Vehicle> vehicles;

VehicleInventoryManagement(List<Vehicle> vehicle){
    this.vehicles = vehicle;
}

public List<Vehicle> getVehicles(){
return vehicles;
}

public void setVehicles(List<Vehicle>vehicles){
    this.vehicles = vehicles;
}

}
