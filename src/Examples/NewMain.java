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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   System.out.println("type in a phrase you would like to convert to Ubbi Dubbi");
         String phrase = input.nextLine();
        String a = "";
        for (int i = 0; i < phrase.length(); i++) {
        if (phrase.charAt(i) == 'a' || phrase.charAt(i) == 'e' || phrase.charAt(i) == 'i' || phrase.charAt(i) == 'o' || phrase.charAt(i) == 'u') {
            a += "ub";
            a += phrase.charAt(i);
            // +ub 
            // +a
            if (phrase.charAt(i+1) == 'a'){
                a += phrase.charAt(i+1);
                // +a
                // i +1
                } else {
                    if (phrase.charAt(i+1) == 'e') {
                        a += phrase.charAt(i+1);
                    }
                }
                        if (phrase.charAt(i+1) == 'i'){
                            a += phrase.charAt(i+1);
                    }else {
                        if (phrase.charAt(i+1) == 'o'){
                            a += phrase.charAt(i+1);
                            }
                    }
                        if (phrase.charAt(i+1) == 'u') {
                            a += phrase.charAt(i+1);
                            } 


        }
                        else {
                            a += phrase.charAt(i);

                        }

        // here i am check to see if the String contains any vowels or vowel
        // clusters

        // here i printed out the new word



        }
        System.out.println(a);    
    }
    }