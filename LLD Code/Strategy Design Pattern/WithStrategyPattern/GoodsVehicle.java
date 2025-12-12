package WithStrategyPattern;

import WithStrategyPattern.Strategy.DrivingStategy;

public class GoodsVehicle extends Vehicle {

    public GoodsVehicle(DrivingStategy stategy){
        super(stategy);
    }  
}
