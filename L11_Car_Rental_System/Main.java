package L11_Car_Rental_System;

import java.util.*;

import L11_Car_Rental_System.Product.*;

public class Main {
    
    public static void main(String[] args) {
        List<User> users = addUsers();
        List<Vehicle> vehicles = addVehicle();
        List<Store> stores = addStores(vehicles);

        VehicleRentalSystem rentalSystem = new VehicleRentalSystem(stores, users);

        User user = users.get(0);
        Location location = new Location(40222, "kolkata", "WB", "India");
        Store store = rentalSystem.getStore(location);

        List<Vehicle> storVehicles = store.getVehicles(VehicleType.CAR);

        Reservation reservation  = store.createReservation(storVehicles.get(0), users.get(0));
        
        Bill bill = new Bill(reservation);
        Payment payment = new Payment();
        payment.payBill(bill);
        store.completeReservation(reservation.reservationId);
    }

    public static List<Vehicle> addVehicle(){
        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle vehicle1 = new Car();
        vehicle1.setVehicleId(1);
        vehicle1.setVehicleType(VehicleType.CAR);
        vehicles.add(vehicle1);

        Vehicle vehicle2 = new Car();
        vehicle2.setVehicleId(2);
        vehicle2.setVehicleType(VehicleType.CAR);
        vehicles.add(vehicle2);

        return vehicles;

    }

    public static List<User> addUsers(){
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setUserId(1);

        users.add(user1);
        return users;
    }

    public static List<Store> addStores(List<Vehicle> vehicles){
    List<Store> stores = new ArrayList<>();
    Store store1 = new Store();
    store1.storeId = 1;
    store1.setVehicles(vehicles);
    stores.add(store1);
    return stores;
    }

}
