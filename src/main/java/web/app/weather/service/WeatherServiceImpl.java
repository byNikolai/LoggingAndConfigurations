package web.app.weather.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import web.app.weather.model.Weather;
import web.app.weather.model.WeatherMain;
import web.app.weather.model.WeatherWind;

import java.math.BigDecimal;

@Service
@Profile("!production")
public class WeatherServiceImpl implements WeatherService{
    @Override
    public Weather getWeather(String city) {
        Weather weather = new Weather();
        WeatherMain weatherMain = new WeatherMain();
        WeatherWind weatherWind = new WeatherWind();
        weatherMain.setTemp(BigDecimal.ONE);
        weatherMain.setHumidity(BigDecimal.ONE);
        weatherWind.setSpeed(BigDecimal.ONE);
        weatherWind.setDeg(1);
        weather.setMain(weatherMain);
        weather.setWind(weatherWind);
        return weather;
    }
}
