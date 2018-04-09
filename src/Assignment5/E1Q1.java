
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.Scanner;

/**
 *
 * @author lafrh7794
 */
public class E1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
     
        //keep looping
        while (true){
            
        //get the word to translate
        System.out.println("Enter a word you would like to translate");
       
        //the word that the user would like to translate
        String origWord = input.nextLine();
        
        //stanitize the input
        origWord = origWord.toLowerCase();
      
        ///turn your old word into your new word
        String tranWord = " " +origWord; 
        
       
        // find the lenth of your position
        int lenth = tranWord.length();
                
        //what is the vowels length
        for(int i = 0; i < lenth; i++){

                //the charachtor at postition i, is it a vowel? 
                if (tranWord.charAt(i)=='a'||
                    tranWord.charAt(i)=='e'||
                    tranWord.charAt(i)=='i'||
                    tranWord.charAt(i)=='o'||
                    tranWord.charAt(i)=='u')
                { //teh charactor at position i-1, is it a vowel?
                    if(!(tranWord.charAt(i-1)=='a'||
                    tranWord.charAt(i-1)=='e'||
                    tranWord.charAt(i-1)=='i'||
                    tranWord.charAt(i-1)=='o'||
                    tranWord.charAt(i-1)=='u')) {
                      
             //create your new word     
             String start = tranWord.substring(0, i);
             String end = tranWord.substring(i);
             tranWord = start + "ub" + end;
             
             lenth = tranWord.length();
             //keep checking the lenth of the word 
             i = i + 2;
             
                   }
              }
           
          } 
            //you word is ----- after it has been translated
            System.out.println(origWord + "is" + tranWord + "in Ubbi Dubbi");
        }
    }
}



