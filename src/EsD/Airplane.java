package EsD;

import java.util.ArrayList;

public abstract class Airplane {
    protected ArrayList<Flight> airplanes;

    public Airplane() {
        this.airplanes = new ArrayList<>();
    }

    public void addFlight(Flight flight)throws Exception{
        if(flight==null) throw new IllegalArgumentException("flight cannot be null");
        airplanes.add(new Flight(flight.getCittaP(), flight.getCittaA(), flight.getId(), flight.getOraP(), flight.getOraA()));

    }
}
