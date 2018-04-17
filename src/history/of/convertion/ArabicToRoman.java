/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package history.of.convertion;

/**
 *
 * @author Kamil
 */
public class ArabicToRoman {
    
    public String arabicNumber;
    public String romanNumberResult;
       
    @Override
    public String toString(){
        return "\n  " + arabicNumber + " converted: " + romanNumberResult +"\n";
    }
}
