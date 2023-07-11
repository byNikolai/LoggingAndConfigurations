package web.app.weather.model;

import java.math.BigDecimal;
import java.util.Objects;

public class WeatherMain {

    private BigDecimal temp;
    private BigDecimal humidity;

    public WeatherMain() {
    }

    public BigDecimal getTemp() {
        return temp;
    }

    public void setTemp(BigDecimal temp) {
        this.temp = temp;
    }

    public BigDecimal getHumidity() {
        return humidity;
    }

    public void setHumidity(BigDecimal humidity) {
        this.humidity = humidity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeatherMain that = (WeatherMain) o;
        return Objects.equals(temp, that.temp) && Objects.equals(humidity, that.humidity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(temp, humidity);
    }

    @Override
    public String toString() {
        return "WeatherMain{" +
                "temp=" + temp +
                ", humidity=" + humidity +
                '}';
    }
}
