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
public class A7Q6 {

public static int lastnum(int a){
    //see the last dig and if the last dig is negative make it positive
     a = a % 10;
     if (a < 0){
      a = a*-1;
     }
    System.out.println("The last digit " + a );
   return 0;
 
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         System.out.println("What is the number?");
         int a = input.nextInt();
         lastnum(a);
        
    }
}

