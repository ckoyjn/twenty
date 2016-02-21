/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

/**
 * 3
 * @author Administrator
 */

public class Client {

    public static void main(String[] args) {
     
        Receiver receiver = new Receiver();
     
        Command command = new ConcreteCommand(receiver);
       
        Invoker invoker = new Invoker(command);
        
        invoker.action();
        
    }
}
