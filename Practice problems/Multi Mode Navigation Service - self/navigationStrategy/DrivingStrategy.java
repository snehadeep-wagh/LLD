package navigationStrategy;

import java.util.Random;

public class DrivingStrategy implements RoutingStrategy {

    @Override
    public Integer getETA(String src, String dest) {
        Random rand = new Random();
        int min = 10;
        int max = 100;
        int eta = rand.nextInt((max - min + 1)) + min;
        return eta;
    }

    @Override
    public String getRoute(String src, String dest) {
        return "This is the driving route from " + src + " to " + dest + " considering the traffic, road limits, and highways";
    }

}
