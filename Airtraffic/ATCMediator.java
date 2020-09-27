package Airtraffic;

import Airtraffic.Runway;

public class ATCMediator implements IATCMediator {

    private Flight flight;
    private Runway runway;
    public boolean land;

    @Override
    public void registerFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    @Override
    public void setLandingStatus(boolean status) {
        land = status;
    }

    @Override
    public boolean isLandingOk() {
        return land;
    }

}
