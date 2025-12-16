package navigationStrategy;

import java.util.Random;

import model.NavigationContext;

public class WalkingStrategy implements RoutingStrategy {
    @Override
    public Integer getETA(NavigationContext NavigationContext) {
        Random rand = new Random();
        int min = 100;
        int max = 400;
        int eta = rand.nextInt((max - min + 1)) + min;
        return eta;
    }

    @Override
    public String getRoute(String src, String dest) {
        return "This is the walking route from " + src + " to " + dest
                + " considering the sidewalks, pedestrian paths, and ignoring one-way streets.";
    }
}
