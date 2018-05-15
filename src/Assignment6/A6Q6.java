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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scan input and ask for numbers
       Scanner input = new Scanner (System.in);
        System.out.println("How many students are there?");
       int num = input.nextInt();
       double[] pos = new double [num];
       double blank = 0;
       double avg = 0;
        double total = 0;
        System.out.println("What are thier marks?");
       
        //find position and value of number
        for (int i = 0; i < pos.length; i++) {
          pos[i] = input.nextDouble();
          
        }
        //change the oders of each number so that we know what high and low is
        for (int i = 0; i < pos.length; i++) {
            for (int j = i +1 ; j < pos.length; j++) {
             if ( pos [i] >pos [j] ){
              blank = pos[i];
             pos [i] = pos[j];
              pos [j] = blank;
              
             }
                
            }
            }

        
        //add up all marks
        for (int i = 0; i < pos.length; i++) {
        total = total + pos[i];
        }
        //output avg high and low
        avg = total / num;
       double high = pos[pos.length-1];
        double low = pos[0];
           System.out.println("The highest mark is; " + high);
           System.out.println("The Lowest mark is; " + low);
           System.out.println("The average is; " + avg);
        
                       
               }
        }  
