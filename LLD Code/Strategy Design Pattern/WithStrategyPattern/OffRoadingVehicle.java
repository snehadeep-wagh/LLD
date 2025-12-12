package WithStrategyPattern;

import WithStrategyPattern.Strategy.DrivingStategy;

public class OffRoadingVehicle extends Vehicle {

    public OffRoadingVehicle(DrivingStategy strategy){
        super(strategy);
    }

}
