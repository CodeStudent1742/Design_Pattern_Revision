package example2;

import example2.notification.InternetNews;
import example2.notification.RadioNews;
import example2.notification.TvNews;
import example2.weather.WeatherForecast;

public class Main {

    public static void main(String[] args) {

        WeatherForecast weatherForecast = new WeatherForecast(25,1000);
        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();
        TvNews tvNews = new TvNews();

        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(tvNews);
        weatherForecast.registerObserver(internetNews);

        weatherForecast.notifyObservers();

        weatherForecast.unregisterObserver(tvNews);
        weatherForecast.unregisterObserver(radioNews);

        System.out.println("Nowa prognoza - powiadomienie tylko dla serwisu internetowego:");
        weatherForecast.updateForecast(18, 1007);
    }

}
