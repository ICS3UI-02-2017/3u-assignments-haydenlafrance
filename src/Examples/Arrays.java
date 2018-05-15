/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.Scanner;

/**
 *
 * @author lafrh7794
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //scanner for input
        Scanner input = new Scanner(System.in);
        
        //make array to story info
        double[] expenses = new double[6];
        
     //let the user know how to get costs 
        System.out.println("Please enter the six costs you want");
        
        //use a for loop for input
       
        for(int i = 0; i< expenses.length; i++){
            expenses[i] = input.nextDouble();

        }
        double sum = 0;
        for (int i = 0; i < expenses.length ; i++) {
         //get the expense
            double expense = expenses[i];
         //add it to the sum
          sum = sum + expense;
        }
        System.out.println("Prom costs" + sum);
        //take the sum divide by 35, always round up
        double tic = Math.ceil(sum/35);
        System.out.println("Need to sell" + tic + "tickets to break even");
    }
}
