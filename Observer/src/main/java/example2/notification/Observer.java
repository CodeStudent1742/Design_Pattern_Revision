package example2.notification;

import example2.weather.WeatherForecast;

public interface Observer {

    void updateForecast(WeatherForecast weatherForecast);
}
