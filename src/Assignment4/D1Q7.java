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
public class D1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int y = 1;
        System.out.println("please enter Your name");
        String b = input.nextLine();
        while (y<99) {
           if (y<99){
           System.out.println("what is the sum of " + b+  " roll?");
           int d = input.nextInt();
            if (y + d >100){
             d = 0;
           }
           y = y +d;
           System.out.println("you rolled a " + d + " you are now at square " + (y));
            if ((y) == 54){
           y = 19;} 
           if ((y) == 90){
           y = 48;}
            if ((y) == 99){
            y = 77;}
            if ((y)==9 ){
            y = 34;
            }
            if ((y)==40 ){
            y = 64;
            }
            if ((y)==67 ){
            y = 86;
            }
            
           }
        }
        if (y == 100) { 
        System.out.println("Congratulations you have won the game!");
           
         }
    }
}
