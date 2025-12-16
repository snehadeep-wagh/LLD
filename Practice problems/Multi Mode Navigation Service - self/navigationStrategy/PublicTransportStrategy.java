package navigationStrategy;

import java.util.Random;

public class PublicTransportStrategy implements RoutingStrategy {
    @Override
    public Integer getETA(String src, String dest){
        Random rand = new Random();
        int min = 30;
        int max = 150;
        int eta = rand.nextInt((max - min + 1)) + min;
        return eta;
    }

    @Override
    public String getRoute(String src, String dest){
        
        return "This is the public transport route from " + src + " to " + dest + " considering the bus/train schedule and stops.";
    }
}
