package WithStrategyPattern.Strategy;

public class NormalDrivingStategy implements DrivingStategy{
    @Override
    public void drive(){
        System.out.println("Normal driving...");
    }
}
