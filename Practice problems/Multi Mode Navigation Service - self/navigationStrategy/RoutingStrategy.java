package navigationStrategy;

import model.NavigationContext;

public interface RoutingStrategy {
    Integer getETA(NavigationContext NavigationContext);
    String getRoute(String src, String dest);
}