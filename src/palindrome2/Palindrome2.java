/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome2;

/**
 *
 * @author aamir7110
 */

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
public class Palindrome2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Character> revChar = new ArrayList();
        
        JFrame frame = new JFrame();
        
        String input;
        String[] words; 
        String[] revWords;
        String revInput;
        String compareWord;
        String compareRevWord;
        
        int numPal = 0;
        
        input = JOptionPane.showInputDialog("Enter a sentence");
        
        words = input.split("\\s");
        
        for(int i = input.length()-1; i>=0;i--){
            revChar.add(input.charAt(i));
            
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(Character ch:revChar){
            sb.append(ch);
        }
        revInput = sb.toString();
        
        revWords = revInput.split("\\s");
        
        for(int i = 0; i < words.length;i++){
         
            System.out.println(words[i]);
            System.out.println(revWords[i]);
            
            compareWord = words[i];
            compareRevWord = revWords[i];
            System.out.println("compare Word: "+compareWord);
            System.out.println("compare rev word: "+compareRevWord);
            if(compareWord.equals(compareRevWord)){
                
                System.out.println(revWords[i]);
                System.out.println(words[i]);
                numPal ++;
            }else{
                System.out.println("if dont work bro");
            }   
        }
        JOptionPane.showMessageDialog(frame, "there are "+numPal+" Palindromes in this sentence");
    }
    
}
