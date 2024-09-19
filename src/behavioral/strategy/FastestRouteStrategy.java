package behavioral.strategy
public class FastestRouteStrategy implements RouteStrategy {
    @Override
    public void calculateRoute(String start, String end) {
        System.out.println("Calculating fastest route from " + start + " to " + end);
    }
}


