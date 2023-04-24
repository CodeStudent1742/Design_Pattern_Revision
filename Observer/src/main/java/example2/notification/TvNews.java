package example2.notification;

import example2.weather.WeatherForecast;

public class TvNews implements Observer{

    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("TV - Temparature is: "+weatherForecast.getTemperature()+" pressure is: " + weatherForecast.getPressure());
    }
}
