package web.app.weather.service;

import web.app.weather.model.Weather;

public interface WeatherService {
    Weather getWeather(String city);
}
