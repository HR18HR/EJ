package Weather;

import java.util.ArrayList;
import java.util.Date;

public class AlertSystem {
    public static ArrayList<WeatherAlert> getAlerts(ArrayList<WeatherAlert>alerts, Date inizio,Date fine) throws WeatherValueException{
        ArrayList<WeatherAlert> alert = alerts;
        ArrayList<WeatherAlert>k=new ArrayList<>();
        for(WeatherAlert a:alerts){
            if(inizio.before(a.getDate())&&fine.after(a.getDate()))k.add(a);
        }
        return k;
    }
}
