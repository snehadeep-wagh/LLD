package navigator;

import navigationStrategy.DrivingStrategy;
import navigationStrategy.RoutingStrategy;

public class Navigator {
    private RoutingStrategy routingStrategy;
    
    public Navigator(){
        // default strategy
        routingStrategy = new DrivingStrategy();
    }

    public void setStrategy(RoutingStrategy routingStrategy){
        this.routingStrategy = routingStrategy;
    }

    public RoutingStrategy getRoutingStrategy(){
        return routingStrategy;
    }

    public String generateRoute(String src, String dest){
        return routingStrategy.getRoute(src, dest);
    }

    public Integer calculateEta(String src, String dest){
        return routingStrategy.getETA(src, dest);
    }
}
