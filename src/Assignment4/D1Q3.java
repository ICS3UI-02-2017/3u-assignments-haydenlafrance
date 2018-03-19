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
public class D1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //read string and input 4 the 4 numbers in a sentance
         Scanner input = new Scanner(System.in);
         System.out.println("Write 4 numbers on seprate lines");
         String a = input.nextLine();
         String b = input.nextLine();
         String c = input.nextLine();
         String d = input.nextLine();
         System.out.println("your numbers were " + a + "," + b + "," + c + " and " +d);
    }
}
