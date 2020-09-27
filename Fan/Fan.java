/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fan;

/**
 *
 * @author Lasantha Sanjeewa
 */
class Fan {
    private Mediator mediator;
    private boolean isOn = false;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        this.mediator.start();
        isOn = true;
        System.out.println("Fan is on");
    }

    public void turnOff() {
        isOn = false;
        this.mediator.stop();
        System.out.println("Fan is off");
    }
}
