package web.app.weather.model;

import java.math.BigDecimal;
import java.util.Objects;

public class WeatherWind {

    private BigDecimal speed;
    private Integer deg;

    public WeatherWind() {
    }

    public BigDecimal getSpeed() {
        return speed;
    }

    public void setSpeed(BigDecimal speed) {
        this.speed = speed;
    }

    public Integer getDeg() {
        return deg;
    }

    public void setDeg(Integer deg) {
        this.deg = deg;
    }

    @Override
    public String toString() {
        return "WeatherWind{" +
                "speed=" + speed +
                ", deg=" + deg +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeatherWind that = (WeatherWind) o;
        return Objects.equals(speed, that.speed) && Objects.equals(deg, that.deg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, deg);
    }
}
