
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        long min = sc.nextLong();
        
         long mininyear = 60*24*365 ;
        long year = min/mininyear ; 
         long days = (min%mininyear)/(60*24) ;
        System.out.println(min + " minutes is approximately " + year + " years and " + days +" days");
        
    }
    }

