/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convert.numbers;

import exceptions.WrongNumberException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kamil
 */
public class RomanToArabicConverter {

    List<Integer> valuesToAdd = new ArrayList<>();

    private int giveRomanValue(String roman) throws WrongNumberException {
        switch (roman) {
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;

            default:
                throw new WrongNumberException();
        }
    }

    public void romanToArabicSwapper(List<String> romanNumberArray) throws WrongNumberException {

        int length = romanNumberArray.size()-1;

        for (int i = 0; i <= length; i++) {
            
            int presentNumber = giveRomanValue(romanNumberArray.get(i));
            
            if (i + 1 <= length) {
                
                int nextNumber = giveRomanValue(romanNumberArray.get(i + 1));
                
                if(presentNumber < nextNumber)
                    valuesToAdd.add(presentNumber*(-1));
                else
                    valuesToAdd.add(presentNumber);              
            }
            else{
                valuesToAdd.add(presentNumber);
            }

        }
    }

    public int romanToArabicResultCounter() {

        int result = 0;
        int size = valuesToAdd.size();

        for (int i = 0; i < size; i++) {
            result = result + valuesToAdd.get(i);
        }

        System.out.println(result);

        return result;
    }

}
