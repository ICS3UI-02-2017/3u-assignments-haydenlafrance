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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //how many heights are there? 
        Scanner input = new Scanner(System.in);
        System.out.println("How Many people are there?");
        int people = input.nextInt();
        double[] height = new double[people];
        System.out.println("What are thier  heights?");
        
        //what are the heights entered
        for (int i = 0; i < height.length; i++) {
           height [i]= input.nextDouble();
            

        }
        //what is the average 
          double totalheight = 0;
                    double avg = 0;
        for (int j = 0; j < height.length; j++) {
            
            totalheight = totalheight + height [j];

            
            
        }
        //position at k
                    avg = (totalheight/people);
        for (int k = 0; k < height.length; k++) {
         
        //output those above the average 
          if (height [k] > avg){
              System.out.println("");
              System.out.println("Ther average height is " + avg);
              System.out.println("");
              System.out.println("The height " + height [k] + " is above the average height.");
              
          }
            
        }
            
        }
        
    }

