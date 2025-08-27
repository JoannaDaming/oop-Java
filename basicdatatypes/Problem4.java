
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input weight in pounds: ");
        double weight = sc.nextDouble();
        
        System.out.print("Input height in inches: ");
        double height = sc.nextDouble();
        
        double weightinkg = weight*0.45359237; 
        double heightinmeters = height*0.0254;
        double bmi = weightinkg/(heightinmeters * heightinmeters ) ;
        
        System.out.println("Body mass Index is " + bmi);
        
    }
}
