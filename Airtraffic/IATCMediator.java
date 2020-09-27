package Airtraffic;

import Airtraffic.Flight;
import Airtraffic.Runway;

/**
 *
 * @author Niwanthi Dilupama
 */
public interface IATCMediator {

    public void registerFlight(Flight flight);

    public void registerRunway(Runway runway);

    public void setLandingStatus(boolean status);

    public boolean isLandingOk();

}
