package exercises;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input first number: ");
        int firstnum = sc.nextInt();
        System.out.print("input second number: ");
        int secondnum = sc.nextInt();
         int sum =firstnum+secondnum; 
         int sub =firstnum-secondnum;
         int mul =firstnum*secondnum;
         int div =firstnum/secondnum;
         int mod =firstnum%secondnum;
        System.out.println(firstnum + " * " + secondnum + "=" + sum);
        System.out.println(firstnum + " - " + secondnum + "=" + sub);
        System.out.println(firstnum + " * " + secondnum + "=" + mul);
        System.out.println(firstnum + " / " + secondnum + "=" + div);
        System.out.println(firstnum + " mod " + secondnum + "=" + mod);
        
    }
    
}
