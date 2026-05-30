package L11_Car_Rental_System;

import java.util.*;

public class VehicleRentalSystem {
    List<Store> storeList;
    List<User> userList;

    VehicleRentalSystem(List<Store> stores, List<User> users){
        this.storeList = stores;
        this.userList = users;
    }

    public Store getStore(Location location){
        for(Store store : storeList){
            if(store.storeLocation.equals(location)){
                return store;
            }
        }
        return null;
    }
}
