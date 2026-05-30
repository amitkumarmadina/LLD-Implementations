package L11_Car_Rental_System.Product;

import java.util.*;

public abstract class Vehicle {
int vehicleId;
int vehicleNumber;
VehicleType  vehicleType;
String companyName;
String modelName;
int kmDriven;
Date menufacturingDate;
int average;
int cc;
int dailyRentalCost;
int hourlyRentalCost;
int noOfSeates;
Status status;

public int getVehicleId(){
    return vehicleId;
}

public void setVehicleId(int vehicleId){
    this.vehicleId = vehicleId;
}

public int getVehicleNumber(){
    return vehicleNumber;
}

public void setVehicleNumber(int vehicleNumber){
    this.vehicleNumber = vehicleNumber;
}

public VehicleType getVehicleType(){
    return vehicleType;
}



}
