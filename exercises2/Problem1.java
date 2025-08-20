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
public class Problem1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); //to accept user input
        System.out.print("Input Number: ");
        int firstnum = sc.nextInt();

        if (firstnum > 0) {
            System.out.println(firstnum + " is positive");
        } else if (firstnum < 0) {
            System.out.println(firstnum + " is negative");

        }
    }
}
    


