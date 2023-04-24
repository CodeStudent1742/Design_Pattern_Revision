package example2.notification;

import example2.weather.WeatherForecast;

public class RadioNews implements Observer{

    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio - Temparature is: "+weatherForecast.getTemperature()+" pressure is: " + weatherForecast.getPressure());
    }
}
