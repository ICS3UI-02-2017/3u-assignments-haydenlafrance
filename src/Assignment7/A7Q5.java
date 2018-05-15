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
public class A7Q5 {

public static void chaotic(int a){
    //make the astrics per line
    for (int i = 0; i < a; i++) {
    System.out.println("");
    double c = Math.floor(Math.random()*5)+ 1;
        for (int j = 0; j < c; j++) {
            System.out.print("*");
            
        }
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //read how many lines user wants
       Scanner input = new Scanner(System.in);
       System.out.println("How many lines do you want?");
       //how many lines?
       int a = input.nextInt();
       chaotic(a);
       
        
    }
}
