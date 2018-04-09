
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
        String newWord = " " +origWord; 
        
       
        // find the lenth of your position
        int lenth = newWord.length();
                
        //what is the vowels length
        for(int i = 0; i < lenth; i++){

                //the charachtor at postition i, is it a vowel? 
                if (newWord.charAt(i)=='a'||
                    newWord.charAt(i)=='e'||
                    newWord.charAt(i)=='i'||
                    newWord.charAt(i)=='o'||
                    newWord.charAt(i)=='u')
                { //teh charactor at position i-1, is it a vowel?
                    if(!(newWord.charAt(i-1)=='a'||
                    newWord.charAt(i-1)=='e'||
                    newWord.charAt(i-1)=='i'||
                    newWord.charAt(i-1)=='o'||
                    newWord.charAt(i-1)=='u')) {
                      
             //create your new word     
             String start = newWord.substring(0, i);
             String end = newWord.substring(i);
             newWord = start + "ub" + end;
             
             lenth = newWord.length();
             //keep checking the lenth of the word 
             i = i + 2;
             
                   }
              }
           
          } 
            //you word is ----- after it has been translated
            System.out.println("your word in Ubbi Dubbi is" + newWord);
        }
    }
}


