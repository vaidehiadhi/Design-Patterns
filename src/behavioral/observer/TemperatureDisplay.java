package behavioral.observer;
public class TemperatureDisplay implements Observer {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("Temperature: " + temperature);
    }
}

