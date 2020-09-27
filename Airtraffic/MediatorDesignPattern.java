package Airtraffic;

import Airtraffic.IATCMediator;
import Airtraffic.Flight;
import Airtraffic.ATCMediator;
import Airtraffic.Runway;

public class MediatorDesignPattern {

    public static void main(String args[]) {

        IATCMediator atcMediator = new ATCMediator();

        Runway mainRunway = new Runway(atcMediator);

        Flight sparrow1 = new Flight(atcMediator);
        //Flight sparrow2 = new Flight(atcMediator);

        atcMediator.registerFlight(sparrow1);
        atcMediator.registerRunway(mainRunway);

        sparrow1.getReady();
        mainRunway.land();
        sparrow1.land();

        //sparrow2.land();   
        //sparrow1.parked();
        //sparrow2.land();
    }

}
