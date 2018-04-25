/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author lafrh7794
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int[] prime = new int [1000];
        for (int f = 0; f < 1000; f++) {
            prime[f] = f;
            
        }
        for (int n = 2; n < 1000; n++) {
        for (int p = 2; p < 1000; p++) {
            int q = 0;
            q = p * n;
         if (q<1000){
             prime[q] = -1 ;
         }
        } 
        }
        for (int g = 0; g < 1000; g++) {
           if (prime[g]!= -1 && prime[g]!= 0){ 
               System.out.println(prime[g]);
               
           }
         
        }
        
        
        
    }
}
