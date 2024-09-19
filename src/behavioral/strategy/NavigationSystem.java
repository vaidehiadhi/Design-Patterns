package behavioral.strategy
public class NavigationSystem {
    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void findRoute(String start, String end) {
        strategy.calculateRoute(start, end);
    }
}
