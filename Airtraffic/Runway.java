package Airtraffic;

public class Runway implements Command {

    private IATCMediator atcMediator;  // obj for actmediator

    public Runway(IATCMediator atcMediator) {
        this.atcMediator = atcMediator;
        atcMediator.setLandingStatus(true);
    }

    @Override
    public void land() {
        System.out.println("Landing permission granted.");
        atcMediator.setLandingStatus(true);
    }

}
