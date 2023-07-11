package web.app.weather.model;

import java.util.Objects;

public class Weather {
    private WeatherMain main;
    private WeatherWind wind;

    public Weather() {
    }

    public WeatherMain getMain() {
        return main;
    }

    public void setMain(WeatherMain main) {
        this.main = main;
    }

    public WeatherWind getWind() {
        return wind;
    }

    public void setWind(WeatherWind wind) {
        this.wind = wind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weather weather = (Weather) o;
        return Objects.equals(main, weather.main) && Objects.equals(wind, weather.wind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(main, wind);
    }

    @Override
    public String toString() {
        return "Weather{" +
                "main=" + main +
                ", wind=" + wind +
                '}';
    }
}
