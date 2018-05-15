/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author lafrh7794
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //scan input and ask for numbers
       Scanner input = new Scanner (System.in);
       double[] pos = new double [10];
       double blank = 0;
        System.out.println("What are the 10 marks?");
       
        //find position and value of number
        for (int i = 0; i < pos.length; i++) {
          pos[i] = input.nextDouble();
          
        }
        //change the oders of each number
        for (int i = 0; i < pos.length - 1; i++) {
            for (int j = i +1 ; j < 10; j++) {
             if ( pos [i] >pos [j] ){
              blank = pos[i];
             pos [i] = pos[j];
              pos [j] = blank;
              
             }
                
            }
                     
            }
        //print out the 10 numbers in acending order 
           System.out.println("The numbers in acsending order arel; ");
            for (int c = 0; c < pos.length; c++){
                System.out.println("" + pos[c] + ", ");
        }  
    }
}
