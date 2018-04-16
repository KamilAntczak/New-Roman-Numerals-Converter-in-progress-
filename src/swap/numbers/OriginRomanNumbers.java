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
public class OriginRomanNumbers {
    
    public String giveRomanNumber(int number) throws WrongNumberException{
        switch(number){
            case 1: return "I";
            case 5: return "V";
            case 10: return "X";
            case 50: return "L";
            case 100: return "C";
            case 500: return "D";
            case 1000: return "M";
            case 5000: return "V!";
            case 10000: return "X!";
            
            default: throw new WrongNumberException();
        }
    }
}
