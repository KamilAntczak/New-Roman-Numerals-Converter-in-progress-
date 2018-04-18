/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convert.numbers;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Kamil
 */
public class RomanToArabicConvertion {
    List<String> userRomanNumber = new ArrayList<>();
    ArabicNumberValidation validate = new ArabicNumberValidation();
    
    public void addNumeberToList(String userNumber){
        userRomanNumber.add(userNumber);
        System.out.println(userRomanNumber);
    }
    
    
    public String printRomanNumber(){
        return "Your Roman Number : " + userRomanNumber.toString();
    }
    
    public List<String> getList(){
        return userRomanNumber;
    }
}
