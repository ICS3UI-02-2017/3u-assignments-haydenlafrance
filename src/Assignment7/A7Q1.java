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
public class A7Q1 {
    
    public static double circleArea(double a){
        //equation for area of a circle
        double area = Math.PI*(Math.pow(a, 2));
        //return result
        return area;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       //scan input and ask for numbers
       Scanner input = new Scanner (System.in);
        System.out.println("What is the radius of the circle in cm?");
        
        double a = input.nextDouble();
        double area = circleArea(a);
        System.out.println("Area of this circle is " + area + " cm squared");
        
        
        
        
    }
}
