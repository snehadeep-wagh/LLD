import WithStrategyPattern.SportsVehicle;
import WithStrategyPattern.Vehicle;
import WithStrategyPattern.Strategy.DrivingStategy;
import WithStrategyPattern.Strategy.NormalDrivingStategy;
import WithStrategyPattern.Strategy.SpeedyStrategy;

public class main {
    public static void main(String args[]) {
        DrivingStategy stategy = new NormalDrivingStategy();
        Vehicle vehicle = new SportsVehicle(stategy);

        vehicle.drive();
    }
}
