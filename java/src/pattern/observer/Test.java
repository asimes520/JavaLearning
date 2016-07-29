package pattern.observer;

/**
 * Created by lianglab on 2016/5/26.
 * ¹¦ÄÜ £º
 */
public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(23,34,29.2f);
    }
}
