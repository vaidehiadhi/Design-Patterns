package behavioral.strategy
public class ShortestPathStrategy implements RouteStrategy {
    @Override
    public void calculateRoute(String start, String end) {
        System.out.println("Calculating shortest path from " + start + " to " + end);
    }
}
