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
public class Translator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Scanner input = new Scanner(System.in);
        //repaet ther translator
        while(true) {
        //get the word to translate
        System.out.println("enter a word to translate");
        String origWord = input.nextLine();
        //stanitize the input
        origWord = origWord.toLowerCase();
        //do we start with a vowel
        if(origWord.startsWith("e")||
                origWord.startsWith("i")||
                origWord.startsWith("o")||
                origWord.startsWith("u")||
                origWord.startsWith("a")){
            
            //stick ay on the end
            String transWord = origWord + "ay";
            System.out.println(transWord + " in pig latin");
            
            }
        else {
            //walk down word looking for the vowel 
            int lenth = origWord.length();
            // use a for loop for charctors
            for(int i = 0;i < lenth; i++){
           //the charachtor at postition i, is it a vowel?
                if (origWord.charAt(i)=='a'||
                    origWord.charAt(i)=='e'||
                    origWord.charAt(i)=='i'||
                    origWord.charAt(i)=='o'||
                    origWord.charAt(i)=='u'
                      ){
                    //i is the postion of the vowel
                   String start = origWord.substring(0, i);
                   String end = origWord.substring(i);
                   
                   //compute trans word
                   String transWord = end + start + "ay";
                    System.out.println(transWord + " in pig latin");
                    break;
                    }
               }
           }
        } 
    }
}
