package behavioral.strategy
public class Main {
    public static void main(String[] args) {
        NavigationSystem navSystem = new NavigationSystem();

        navSystem.setStrategy(new ShortestPathStrategy());
        navSystem.findRoute("A", "B");

        navSystem.setStrategy(new FastestRouteStrategy());
        navSystem.findRoute("A", "B");
    }
}
