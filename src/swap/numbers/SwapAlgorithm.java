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
    
    OriginRomanNumbers origin = new OriginRomanNumbers();
    List<String> listOfSingleRoman = new ArrayList<>();
    
    private void swapToRoman(int singleDigit, int power){
        int h;
        int r;
        String smallerRomanNumber="";
        String greaterRomanNumber;
        
        switch (singleDigit){
            case 0:
                break;
            case 1:
                r = (int)(pow(10,power-1));
                for(int i=0; i < singleDigit ; i++){
                    smallerRomanNumber += origin.giveRomanNumber(r);
                }                              
                System.out.println(smallerRomanNumber);
                break;
            case 2:
                r = (int)(pow(10,power-1));
                for(int i=0; i < singleDigit ; i++){
                    smallerRomanNumber += origin.giveRomanNumber(r);
                }                              
                System.out.println(smallerRomanNumber);
                break;
            case 3:
                r = (int)(pow(10,power-1));
                for(int i=0; i < singleDigit ; i++){
                    smallerRomanNumber += origin.giveRomanNumber(r);
                }                              
                System.out.println(smallerRomanNumber);
                break;
            case 4:{
                h = (int)(pow(10,power)/2);
                r = (int) h - (int)((pow(10,power-1))*singleDigit);
                System.out.println(h+ " " + r);
                smallerRomanNumber = origin.giveRomanNumber(r);
                greaterRomanNumber = origin.giveRomanNumber(h);                              
                System.out.println(smallerRomanNumber+greaterRomanNumber);
                break;
            }           
            case 5:{
                 r = (int)((pow(10,power-1))*singleDigit);
                String number = origin.giveRomanNumber(r);
                System.out.println(number);
                break;
            }
            case 6:{
                r = (int)(pow(10,power)/2);
                h = (int)((pow(10,power-1))*singleDigit) - (int) (pow(10,power)/2);              
                System.out.println(h+" " + r);
                smallerRomanNumber = origin.giveRomanNumber(r);
                greaterRomanNumber = origin.giveRomanNumber(h);                              
                System.out.println(smallerRomanNumber+greaterRomanNumber);
                break;
            }
            case 7:{
                r = (int)(pow(10,power)/2);
                h = (int)((pow(10,power-1))*singleDigit) - (int)(pow(10,power)/2);   
                greaterRomanNumber = origin.giveRomanNumber(r);
                System.out.println(h + " " + r);
                for(int i =0 ; i < (h/((int)pow(10,power-1))); i++)
                    smallerRomanNumber += origin.giveRomanNumber((h/h)*(int)pow(10,power-1));
                
                System.out.println(greaterRomanNumber+smallerRomanNumber);
                break;
            }               
            case 8:{ 
                r = (int)(pow(10,power)/2);
                h = (int)((pow(10,power-1))*singleDigit) - (int)(pow(10,power)/2);   
                greaterRomanNumber = origin.giveRomanNumber(r);
                System.out.println(h + " " + r);
                for(int i =0 ; i < (h/((int)pow(10,power-1))); i++)
                    smallerRomanNumber += origin.giveRomanNumber((h/h)*(int)pow(10,power-1));
                
                System.out.println(greaterRomanNumber+smallerRomanNumber);
                break;
            }
            case 9:{
                h = (int) (pow(10,power));
                r = (int) h - (int)(pow(10,power-1));
                smallerRomanNumber = origin.giveRomanNumber(h-r);
                greaterRomanNumber = origin.giveRomanNumber(h);                              
                System.out.println(smallerRomanNumber+greaterRomanNumber);
                break;
            }      
        }
        
    }
    
    public String swapToRoman(String userNumber){
        
        int length = userNumber.length();
        int number = Integer.parseInt(userNumber);
        
        for(int i = 0; i < length; i++)
        {
            int singleDigit = (int) (number / pow(10, length-(1+i)));
            System.out.println(singleDigit);
            swapToRoman(singleDigit,length-i);   
            number -= singleDigit*((int)pow(10, length-(1+i)));
        }        
        return null;
    }
    
}
