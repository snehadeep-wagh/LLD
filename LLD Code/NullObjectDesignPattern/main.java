package NullObjectDesignPattern;

public class main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("Car");

        System.out.println("Vehicle Seating Capacity: " + car.getSeatingCapacity());
        System.out.println("Vehicle Tank Capacity: " + car.getTankCapacity());

        Vehicle truck = VehicleFactory.getVehicle("Truck");

        System.out.println("Vehicle Seating Capacity: " + truck.getSeatingCapacity());
        System.out.println("Vehicle Tank Capacity: " + truck.getTankCapacity());
    }
}
