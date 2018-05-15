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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        //scan input and ask how many studnets there are 
        Scanner input = new Scanner(System.in);
        System.out.println("How many studnets are in the class?");
        int students = input.nextInt();
        double[] marks = new double[students];
        System.out.println("What are thier marks?");
        
        for (int i = 0; i < marks.length; i++) {
            marks [i] = input.nextDouble();

            
        }
        //take all the marks, add them together and create an avg
                    double totalmarks = 0;
                    double avg = 0;
        for (int j = 0; j < marks.length; j++) {

            totalmarks = totalmarks + marks [j];
            avg = (totalmarks/students);
        }
        // print out the mark avg 
       System.out.println("The average is " + avg);
        
        
                
        
        
        
        
    }}

