package Airtraffic;

import Airtraffic.Command;

/**
 *
 * @author Niwanthi Dilupama
 */
public class Flight implements Command {

    private IATCMediator atcMediator;

    public Flight(IATCMediator atcMediator) {
        this.atcMediator = atcMediator;
    }

    @Override
    public void land() {
        if (atcMediator.isLandingOk()) {
            System.out.println("Successfully Landed.");
            atcMediator.setLandingStatus(false); //runway is occupied
        } else {
            System.out.println("Waiting for landing.");
        }
    }

    public void getReady() {
        System.out.println("Ready for landing.");
    }

    public void parked() {
        System.out.println("flight is parked.");
        atcMediator.setLandingStatus(true); //runway is available
    }
}
