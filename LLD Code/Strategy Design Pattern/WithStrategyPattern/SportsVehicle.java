package WithStrategyPattern;

import WithStrategyPattern.Strategy.DrivingStategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle(DrivingStategy stategy){
        super(stategy);
    }

    
}
