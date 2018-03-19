/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author lafrh7794
 */
public class D1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      //let drivers know what the ticket would be
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the speed limit");
      double a = input.nextDouble(); 
      System.out.println("What was the drivers speed?");
      double b = input.nextDouble(); 
      
      if ((b-a)<= 0){
      System.out.println("Congratualations! You are going the speed limit.");
         }else if((b-a)>=1&&(b-a)<=20 ){
       System.out.println("You are speeding your fine is $100");
        
    }
      else if((b-a)>20&&(b-a)<=30 ){
       System.out.println("You are speeding your fine is $270");
        
    }
      else if((b-a)> 30 ){
       System.out.println("You are speeding your fine is $500");
        
    }
      }
    }

