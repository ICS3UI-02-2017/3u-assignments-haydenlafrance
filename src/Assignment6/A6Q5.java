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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //scan input and ask for numbers
       Scanner input = new Scanner (System.in);
        System.out.println("How many marks are there?");
       int num = input.nextInt();
       double[] pos = new double [num];
       double blank = 0;
        System.out.println("What are the marks?");
       
        //find position and value of number
        for (int i = 0; i < pos.length; i++) {
          pos[i] = input.nextDouble();
          
        }
        //change the oders of each number
        for (int i = 0; i < pos.length - 1; i++) {
            for (int j = i +1 ; j < pos.length; j++) {
             if ( pos [i] >pos [j] ){
              blank = pos[i];
             pos [i] = pos[j];
              pos [j] = blank;
              
             }
                
            }
                     
            }
        //if even amount of marks
        if(num%2==0){
          int o = pos.length/2; 
          double median = 0;
          median = pos[o];
         double median2 = pos[o -1 ];
          System.out.println("The median mark is:" + ((median + median2)/2) );
        }
        //if odd amount of marks
        else{
          int o = pos.length/2 ; 
          double median = 0;
          median = pos[o]; 
          System.out.println("The median mark is:" + median);
        }
        //print out the 10 numbers in acending order 
           System.out.println("The numbers in acsending order arel; ");
            for (int c = 0; c < pos.length; c++){
                System.out.println("" + pos[c]);
             
        }  
    }
}
