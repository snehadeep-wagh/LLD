package WithStrategyPattern;

import WithStrategyPattern.Strategy.DrivingStategy;

public class Vehicle {
    DrivingStategy drivingStategy;

    public Vehicle(DrivingStategy strategy) {
        drivingStategy = strategy;
    }

    public void drive() {
        drivingStategy.drive();
    }
}
