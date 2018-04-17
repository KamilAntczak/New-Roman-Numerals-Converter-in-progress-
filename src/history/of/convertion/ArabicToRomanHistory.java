/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package history.of.convertion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kamil
 */
public class ArabicToRomanHistory {
    
    private final List<ArabicToRoman> arabicToRomanList = new ArrayList<>();
    
    
    public void addAtrConvertionToHistory(String userNumber, String romanResult){
        
        ArabicToRoman newConvertion = new ArabicToRoman();
        arabicToRomanList.add(newConvertion);
        newConvertion.arabicNumber = userNumber;
        newConvertion.romanNumberResult = romanResult;   
    }
    
    
    public String printListArabicToRoman(){
        return arabicToRomanList.toString();
    }
}
