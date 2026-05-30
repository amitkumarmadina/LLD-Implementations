package L11_Car_Rental_System;

import L11_Car_Rental_System.Product.Vehicle;
import java.util.*;

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
