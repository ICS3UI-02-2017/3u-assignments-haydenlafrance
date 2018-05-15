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
public class A7Q2 {
    
    
    public static void examGrade(double a){
        //output the grade for each mark
        if (a < 50){
            System.out.println("Your mark is a F");
        }
        if (a >= 50 && a <= 59){
            System.out.println("Your mark is a D");
        }
        if (a >= 60 && a <= 69){
            System.out.println("Your mark is a C");
        }
        if (a >= 70 && a <= 79){
            System.out.println("Your mark is a B");
        }
        if (a > 80){
            System.out.println("Your mark is an A");
            
          
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scan input
         Scanner input = new Scanner (System.in);
         //ask user for mark and run examGrade
         System.out.println("What is your exam mark?");
         double a = input.nextDouble();
         examGrade(a);
    }
}
