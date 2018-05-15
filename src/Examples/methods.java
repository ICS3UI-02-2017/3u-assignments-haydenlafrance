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
public class methods {

    
    //the hello world method tos ay hello 
    public static void helloworld(){
        System.out.println("Hello World!");
    }
    public static void sayhello(String name){
        System.out.println("Hello " + name);
    }
    //calculate the roots
    public static double posquadform(double a,double b ,double c){
        double discrim = b*b - 4*a*c;
        double root = (-b + Math.sqrt(discrim)) / (2*a);
        //send back the root
        return root;
    }
    //calculate the roots
    public static double [] quadform(double a,double b ,double c){
        double [] roots = new double[2];
        double discrim = b*b - 4*a*c;
         roots[0] = (-b + Math.sqrt(discrim)) / (2*a);
         roots[1] = (-b - Math.sqrt(discrim)) / (2*a);
        //send back the root
        return roots;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        
        Scanner in = new Scanner(System.in);
        //call the hello world method
        helloworld();
        
        System.out.println("What is your name?");
        String user = in.nextLine();
        sayhello(user);
        
        //calculate the root 3x^2 + 7x +1.5
        double proot = posquadform(1,-5,-50);
        System.out.println("The positive root is " + proot);
        //
        double[] roots = quadform(1,-5,-50);
        System.out.println("The roots are" + roots[0] + roots[1]);
 
        
        
        
    }
            
}
