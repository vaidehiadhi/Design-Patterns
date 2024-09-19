package behavioral.observer;
public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        TemperatureDisplay tempDisplay = new TemperatureDisplay();

        station.registerObserver(tempDisplay);
        station.setMeasurements(30.0f, 65.0f);
    }
}

