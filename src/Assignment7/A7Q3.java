/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author lafrh7794
 */
public class A7Q3 {

    
 public static void factors(double a){
     
    for (int i = 1; i < a + 1; i++) {
         if(a % i   == 0){ 
             System.out.println("The factors are " + i);
         }
    }
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        
           Scanner input = new Scanner(System.in);
           System.out.println("What number would you like to factor");
           double a = input.nextDouble();
           factors(a);
        
        
    }
}
