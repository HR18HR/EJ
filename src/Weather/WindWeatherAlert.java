package Weather;


import java.util.Date;

public class WindWeatherAlert implements WeatherAlert {
    String Localita;
    Date date;

    public WindWeatherAlert(WeatherData weatherData) throws WeatherValueException {
        if (weatherData == null) throw new WeatherValueException("Error: WeatherData is null");
        if (weatherData.getVelocitavento() < 100) throw new WeatherValueException("Error: Localita is null");
        Localita = weatherData.getLocalita();
        date = weatherData.getData();
    }
    @Override
    public String getLocalita() {
        return Localita;
    }
    @Override
    public Date getDate() {
        return date;
    }
}
