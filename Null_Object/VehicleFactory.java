
public class VehicleFactory{
    static Vehicle getVehicleObj(String vehicleType){
        if("Car".equals(vehicleType)){
            return new Car();
        }
        return new NullVehicle();
    }
}