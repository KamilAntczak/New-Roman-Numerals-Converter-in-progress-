/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Kamil
 */
public class WrongNumberException extends Exception {
    
    public WrongNumberException(){
    }
    
    public void returnError() {
        System.out.println("Invalid Arabic Number");
    }
    
    public void outOfRange(){
        System.out.println("Number is out of range");
    }
}
