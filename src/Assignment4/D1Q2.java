/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author lafrh7794
 */
public class D1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //convert inches to cm 
        Scanner input = new Scanner(System.in);
        System.out.println("enter the measurment you wish to convert");
        Float inch = input.nextFloat();
        System.out.println("that will be " + inch *2.54 + "cm");
        
        
    }
}
