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

public class ConcreteCommand implements Command {
    
    private Receiver receiver;
  
    public ConcreteCommand(Receiver receiver) {
        
        this.receiver = receiver;
        
    }
  
    public void execute() {
    
        receiver.action();
        
    }
}
