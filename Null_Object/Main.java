
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleObj("Car");
        printVehicleDetails(vehicle);
    }

    private static void printVehicleDetails(Vehicle vehicle){
        System.out.println("Seating Capacity : " + vehicle.getSeatCapacity());
        System.out.println("Tank Capacity : " + vehicle.getTankCapacity());
    }
}
