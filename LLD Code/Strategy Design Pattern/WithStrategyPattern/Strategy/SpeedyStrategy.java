package WithStrategyPattern.Strategy;

public class SpeedyStrategy implements DrivingStategy {
    @Override
    public void drive(){
        System.out.println("Speed driving...");
    }
}
