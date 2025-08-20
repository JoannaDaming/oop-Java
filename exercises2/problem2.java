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
public class problem2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in); //to accept user input
        System.out.print("Input Number: ");
        int firstnum = sc.nextInt();
         
         if (firstnum %3==0) {
            System.out.println(firstnum + " is divided by 3");
        } else {
            System.out.println(firstnum + " is not divided by 3");

        }
    }
}
