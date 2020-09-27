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
public class Button {
     private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void press() {
        this.mediator.press();
    }
}
