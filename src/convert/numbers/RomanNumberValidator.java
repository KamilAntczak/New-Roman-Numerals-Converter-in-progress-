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
        
        if( pow(a,aLength-1) != a && pow(b,bLength-1) != b )       
            throw new WrongNumberException();
        
        return true;
    }
    
    private boolean middleChecker(int first, int middle, int last) throws WrongNumberException{
        
        if(middle < first && middle < last)
         throw new WrongNumberException();
        
        return true;
    }
    
    private boolean lastChecker(int first, int last)throws WrongNumberException{
        
        if(first < last)
            throw new WrongNumberException();
        
        return true;
    }
    
    public boolean isRomanValid( List<String> romanNumberArray) throws WrongNumberException{
        
        int length = romanNumberArray.size()-1;
        
        for(int i = 0; i <= length ; i++ ){
            
            int presentNumber = giveRomanValue(romanNumberArray.get(i));
            
            if(i+1 <= length){
                
                int middleNumber = giveRomanValue(romanNumberArray.get(i+1));
            
                powerChecker(presentNumber, middleNumber);
                
                    if(i+2 <= length){
               
                        int lastNumber = giveRomanValue(romanNumberArray.get(i+2));
                        
                        middleChecker(presentNumber, middleNumber, lastNumber);
                        lastChecker(presentNumber,lastNumber);
                    }
            }
 
            
        }
        
        return true;
    }
}
