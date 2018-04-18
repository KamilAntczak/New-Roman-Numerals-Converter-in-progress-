/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convert.numbers;

import exceptions.WrongNumberException;
import java.util.List;

/**
 *
 * @author Kamil
 */
public class ArabicNumberValidation {
    
    
    public void validateNumber(String arabicNumber) throws WrongNumberException {   
        
        if(!(arabicNumber.matches("^[0-9]*$")) || arabicNumber.isEmpty() || arabicNumber.startsWith("0"))
           throw new WrongNumberException();      
    }

    void validateNumber(String userNumber, List<String> userRomanNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
