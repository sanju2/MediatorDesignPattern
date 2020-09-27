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
public class FanDemo {

    private static Button button;
    private static Fan fan;
    
    public static void setUp() {
        button = new Button();
        fan = new Fan();
        PowerSupplier powerSupplier = new PowerSupplier();
        Mediator mediator = new Mediator();

        mediator.setButton(button);
        mediator.setFan(fan);
        mediator.setPowerSupplier(powerSupplier);
    }
    
    public static void main(String[] args) {
        setUp();
        button.press();
        button.press();
    }
    
}
