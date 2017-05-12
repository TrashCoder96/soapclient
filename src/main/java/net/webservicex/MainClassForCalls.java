package net.webservicex;

/**
 * Created by HomeUsing on 13.05.2017.
 */
public class MainClassForCalls {

    public static void main(String[] args) {
        GlobalWeather globalWeather = new GlobalWeather();
        System.out.println(globalWeather.getGlobalWeatherHttpGet().getCitiesByCountry("italy"));
    }

}
