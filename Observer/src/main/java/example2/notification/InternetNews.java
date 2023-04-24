package example2.notification;

import example2.weather.WeatherForecast;

public class InternetNews implements Observer {

    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Internet - Temparature is: "+weatherForecast.getTemperature()+" pressure is: " + weatherForecast.getPressure());
    }
}
