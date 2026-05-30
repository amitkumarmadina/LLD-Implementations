package L12_Car_Rental_System.Product;

import java.util.*;

public abstract class Vehicle {
int vehicleId;
int vehicleNumber;
VehicleType vehicleType;
String companyName;
String modelName;
int kmDriven;
Date manufacturingDate;
int average;
int cc;
int dailyRentalCost;
int hourlyRentalCost;
int noOfSeats;
Status status = Status.AVAILABLE;

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

public void setVehicleType(VehicleType vehicleType){
    this.vehicleType = vehicleType;
}

public int getDailyRentalCost(){
    return dailyRentalCost;
}

public void setDailyRentalCost(int dailyRentalCost){
    this.dailyRentalCost = dailyRentalCost;
}

public int getHourlyRentalCost(){
    return hourlyRentalCost;
}

public void setHourlyRentalCost(int hourlyRentalCost){
    this.hourlyRentalCost = hourlyRentalCost;
}

public Status getStatus(){
    return status;
}

public void setStatus(Status status){
    this.status = status;
}

}
