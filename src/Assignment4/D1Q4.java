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
public class D1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //add costs up together and divide by ticket price 
           Scanner input = new Scanner(System.in);
           System.out.println("enter ticket price");
           Float tix = input.nextFloat();
           System.out.println("How much does hall rent cost?");
           Float a = input.nextFloat();
           System.out.println("How much does food and drink cost?");
           Float b = input.nextFloat();
           System.out.println("How much does a DJ cost?");
           Float c = input.nextFloat();
           System.out.println("How much does decorations cost?");
           Float d = input.nextFloat();
           System.out.println("you will need " +((a+b+c+d)/tix)+ " tickets to break even");
           
          
          
    }
}
