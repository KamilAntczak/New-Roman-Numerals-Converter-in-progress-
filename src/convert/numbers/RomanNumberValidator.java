/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convert.numbers;

import exceptions.WrongNumberException;
import static java.lang.Math.pow;
import java.util.List;

/**
 *
 * @author Kamil
 */
public class RomanNumberValidator {
    
    // That method is kind of mistake, cause I can create one class containing this method and use it also in RomanToArabicConverter class, instead writing it once more. I have to fix that.
    private int giveRomanValue(String roman) throws WrongNumberException{
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
    
    
    private boolean powerChecker(int a, int b)  throws WrongNumberException{
        
        int  aLength =  String.valueOf(a).length();
        int  bLength =  String.valueOf(b).length();
        
     
        
        int powa =  (int) pow(10,(aLength-1));
        int powb = (int) pow(10,(bLength-1));
        
        if( powa != a &&  powb != b && bLength == aLength)      
            throw new WrongNumberException();
        
           if( bLength - aLength > 1 || a*10 < b)
            throw new WrongNumberException();
            
        return true;
   } 
    
    private boolean lastChecker(int first, int middle, int last)throws WrongNumberException{
        
        if(first <= last && first < middle & last < middle)
            throw new WrongNumberException();
        
        return true;
    }
    
    private boolean addNextNumberChecker(int present, int next, int last, int lastPossible, boolean substract)throws WrongNumberException{
        
        if(present  >= next && substract && next >= last && lastPossible != last )
            throw new WrongNumberException();
        
        if(present < next)
            return true;       
        if(substract == true)
            return true;
        
        return false;
    }
    
    private boolean squadChecker(int first, int second, int third, int fourth) throws WrongNumberException{
        
        if(first == second && first == third && first == fourth)
         throw new WrongNumberException();
         
         return true;       
    }
    
    public boolean isRomanValid( List<String> romanNumberArray) throws WrongNumberException{
        
        int length = romanNumberArray.size()-1;
        boolean substractCheck = false;
        
        for(int i = 0; i <= length ; i++ ){
            
            int presentNumber = giveRomanValue(romanNumberArray.get(i));
            
            if(i+1 <= length){
                
                int middleNumber = giveRomanValue(romanNumberArray.get(i+1));
                     
                powerChecker(presentNumber, middleNumber);
                
                    if(i+2 <= length){
                        
                        int lastNumber = giveRomanValue(romanNumberArray.get(i+2));
                                           
                        lastChecker(presentNumber,middleNumber, lastNumber);
                        
                        if(i+3 <= length){
                            int lastPossibleNumber= giveRomanValue(romanNumberArray.get(i+3));
                            squadChecker(presentNumber, middleNumber, lastNumber, lastPossibleNumber);
                             substractCheck = addNextNumberChecker(presentNumber, middleNumber, lastNumber, lastPossibleNumber, substractCheck);
                        }
                    }
            }
        
        }      
        return true;
    }
}
