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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      //read the input 
      Scanner input = new Scanner (System.in);
      double[] pos = new double[2];
        System.out.println("Enter the integers:");
     // take the first and second int and see if they are ascending oprder
      pos[0] = input.nextDouble();
      pos[1] = input.nextDouble();
      double blank = 0;
      if (pos[0] > pos [1] ){
      blank = pos[0];
      pos[0]=pos[1];
      pos[1] = blank;
      
      
      }
      //print out the ints in ascending order
      System.out.println("The integers in acsending order are; " + pos [0] + ", " + pos[1]);
    }
}
