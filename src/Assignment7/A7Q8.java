/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import static Assignment7.A7Q6.lastnum;
import java.util.Scanner;

/**
 *
 * @author lafrh7794
 */
public class A7Q8 {
public static boolean alloddnum(int a){
 while(a>10){
     if (a % 2 == 0){
         return false;
     }
     if ( a % 2 !=0){
    a = a / 10;
}
    
} 
   if (a<10 && a%2 != 0){
        return true;
    }else{
       return false;
   }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        System.out.println("What is the number?");
        int a = input.nextInt();
        System.out.println("" + alloddnum(a));
       
        
        
    }
}