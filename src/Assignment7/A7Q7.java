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
public class A7Q7 {
public static int firstnum(int a){ 
while (a > 10 || a < -10){
    a = a/10;
  }
if (a < 0){
a = a*-1;}

  System.out.println("The first digit is " + a );

return 0;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
       Scanner input = new Scanner(System.in);
       System.out.println("What is the number?");
       int a = input.nextInt();
        firstnum(a);
        
    }
}
