package navigationStrategy;

public interface RoutingStrategy {
    Integer getETA(String src, String dest);
    String getRoute(String src, String dest);
}