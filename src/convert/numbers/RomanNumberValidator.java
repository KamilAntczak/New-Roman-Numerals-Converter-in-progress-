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
public class RomanNumberValidator {
    
    
    public int giveRomanValue(String roman) throws WrongNumberException{
        switch(roman){
            case "I": return 1;
            case "V": return 5;
            case "X": return 10;
            case "L": return 50;
            case "C": return 100;
            case "D": return 500;
            case "M": return 1000;
            
            default: throw new WrongNumberException();
        }
    }
    
    public boolean isRomanValid(String nextPossibleNubmber, List<String> romanNumberArray) throws WrongNumberException{
        
        int length = romanNumberArray.size();
        
        for(int i =0 ; i < length ; i++){
            System.out.println(giveRomanValue(romanNumberArray.get(i)));
        }
        
        return true;
    }
}
