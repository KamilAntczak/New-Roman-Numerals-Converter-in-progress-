/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swap.numbers;

import exceptions.WrongNumberException;

/**
 *
 * @author Kamil
 */
public class ArabicNumberValidation {
    
    
    public void validateNumber(String arabicNumber) throws WrongNumberException {   
        
        if(!(arabicNumber.matches("^[0-9]*$")) || arabicNumber.isEmpty() || arabicNumber.startsWith("0"))
           throw new WrongNumberException();      
    }
}
