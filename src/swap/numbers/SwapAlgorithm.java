/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swap.numbers;

import java.util.List;
import static java.lang.Math.pow;
import java.util.ArrayList;

/**
 *
 * @author Kamil
 */
public class SwapAlgorithm {
    
    List<String> listOfSingleRoman = new ArrayList<String>();
    
     private String giveRomanNumber(int number){
        switch(number){
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 5: return "V";
            case 10: return "X";
            case 50: return "L";
            case 100: return "C";
            case 500: return "D";
            case 1000: return "M";
            case 5000: return "V!";
            case 10000: return "X!";
            
            default: return "out of range";
        }
    }
    
    
    private void swapAndAdd(int singleDigit, int power){
        int h;
        int r;
        
        switch (singleDigit){
            case 1:
            case 2:
            case 3:
            case 4:{
                 h = (int) (pow(10,power)/2);
                 r = (int) h - (int)((pow(10,power-1))*singleDigit);
                System.out.println(h+" " + r);
                String small= giveRomanNumber(r);
                String big = giveRomanNumber(h);                              
                System.out.println(small+"="+big);
                break;
            }           
            case 5:{
                 r = (int) ((pow(10,power-1))*singleDigit);
                String number = giveRomanNumber(r);
                System.out.println(number);
                break;
            }
            case 6:{
                r = (int)(int) (pow(10,power)/2);
                h = (int)((pow(10,power-1))*singleDigit) - (int) (pow(10,power)/2);              
                System.out.println(h+" " + r);
                String small= giveRomanNumber(r);
                String big = giveRomanNumber(h);                              
                System.out.println(small+"="+big);
                break;
            }
            case 7:{
                r = (int)(int) (pow(10,power)/2);
                h = (int)((pow(10,power-1))*singleDigit) - (int) (pow(10,power)/2);              
                System.out.println(h+" " + r);
                String small= giveRomanNumber(r);
                String big = giveRomanNumber(h);                              
                System.out.println(small+"="+big);
                break;
            }
                
            case 8:{
                r = (int)(int) (pow(10,power)/2);
                h = (int)((pow(10,power-1))*singleDigit) - (int) (pow(10,power)/2);              
                System.out.println(h+" " + r);
                String small= giveRomanNumber(r);
                String big = giveRomanNumber(h);                              
                System.out.println(small+"="+big);
                break;
            }
            case 9:{
                 h = (int) (pow(10,power));
                 r = (int) h - (int)(pow(10,power-1));
                String small= giveRomanNumber(h-r);
                String big = giveRomanNumber(h);                              
                System.out.println(small+"-"+big);
                break;
            }      
        }
        
    }
    
    public String swapToRoman(String userNumber){
        
        int length = userNumber.length();
        int number = Integer.parseInt(userNumber);
        
        for(int i = 0; i < length; i++)
        {
            int singleDigit = (int) (number / pow(10, length-1));
            System.out.println(singleDigit);
            swapAndAdd(singleDigit,length);
        }
        
        
        return null;
    }
    
}
