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
public class A7Q4 {

    public static double intrest(double p, double r, double n){
    r = r/100;
    double a = (1 + r);
    double c = Math.pow(a,n);
    double b = p*c;
    
    
    return b;
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ask user for values 
        Scanner input = new Scanner (System.in);
        System.out.println("What is the starting value? What is the intest percent? Over how many years is the investment?");
         // gwt values 
        double p = input.nextDouble();
        double r = input.nextDouble();
        double n = input.nextDouble();
        double value = intrest(p,r,n);
        System.out.println("Your new balence is " + value);
    }
}
