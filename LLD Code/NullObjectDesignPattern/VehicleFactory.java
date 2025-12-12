package NullObjectDesignPattern;

public class VehicleFactory {
    static Vehicle getVehicle(String VehicleType){
        switch (VehicleType){
            case "Car":
                return new Car();
            case "Bike":
                return new Bike();
            default:
                return new NullVehicle();
        }
    }
}
