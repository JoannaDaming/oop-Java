/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //to accept user input
        System.out.print("Input an Alphabet: ");
        int ch = sc.next().charAt(0);
        
        ch= Character.toLowerCase(ch);
        
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        System.out.println("input letter is vowel ");
        } else if (Character.isLetter(ch)){
            System.out.println("input letter is consonant ");
        }else{
            System.out.println("not an alphabet");
            
        }}
    
}
