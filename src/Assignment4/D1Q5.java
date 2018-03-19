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
public class D1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //make computer calculate average 
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = input.nextLine();
        System.out.println("What was the first test out of?");
        double a = input.nextDouble();
        System.out.println("What mark did you get?");
        double b = input.nextDouble();
        System.out.println("What was the second test out of?");
        double c = input.nextDouble();
        System.out.println("What mark did you get?");
        double d = input.nextDouble();
        System.out.println("What was the third test out of?");
        double e = input.nextDouble();
        System.out.println("What mark did you get?");
        double f = input.nextDouble();
        System.out.println("What was the fourth test out of?");
        double g = input.nextDouble();
        System.out.println("What mark did you get?");
        double h = input.nextDouble();
        System.out.println("What was the fifth test out of?");
        double i = input.nextDouble();
        System.out.println("What mark did you get?");
        double j = input.nextDouble();
        System.out.println("Tests scores for " + name);    
        System.out.println("Test 1:" + ((b/a)*100)+ "%");
        System.out.println("Test 2:" + ((d/c)*100)+ "%");
        System.out.println("Test 3:" + ((f/e)*100)+ "%");
        System.out.println("Test 4:" + ((h/g)*100)+ "%");
        System.out.println("Test 5:" + ((j/i)*100)+ "%");
        System.out.println("Average: " +((((b/a)+(d/c)+(f/e)+(h/g)+(+j/i))/5)*100)+ "%");
        
    }
}
