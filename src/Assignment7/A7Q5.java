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

public static int chaotic(int a){
    
  int c = (int)(Math.random()*(a - 1 + 1))+ 1;
  return c;
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //can input
        Scanner input = new Scanner(System.in);
        System.out.println("How many lines do you want?");
       int a = input.nextInt();
        System.out.println(chaotic(a));
       
        
      
        
        
        
    }
}
