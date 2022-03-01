/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

/**
 *
 * @author Pantelis
 */
public class Layouts {
 
    public static String layoutst() {
        return "-----------------------------------------------------";
    } 
    
     public static String largeStringsLayout(String largeString) {
        String[] largeStringArrayOutput = largeString.split(" ");
        String largeStringLayedOut = "";
        for (int i = 0; i < largeStringArrayOutput.length; i++) {
            if (i % 5 == 0) {
                largeStringLayedOut = largeStringLayedOut + "\n";    
            }
            largeStringLayedOut = largeStringLayedOut + (largeStringArrayOutput[i] + " ");
        }
        
        return largeStringLayedOut;
    }
}
