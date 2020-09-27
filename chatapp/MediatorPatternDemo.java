/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatapp;

public class MediatorPatternDemo {

    public static void main(String[] args) {
        User maka = new User("Maka"); //using the constructor initializing User.java 
        User umee = new User("Umee");
        User pori = new User("PoRI");
        maka.sendMessage("Hi Umee!"); //pass this arguments to send message method
        umee.sendMessage("Hello Makooo!");
        pori.sendMessage("Hello All");
    }
}
