
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input distance in meters: ");
        int distance = sc.nextInt();
        
        System.out.print("Input hour: ");
        int hour = sc.nextInt();
        
        System.out.print("Input minutes: ");
        int minutes = sc.nextInt();
        
        System.out.print("Input seconds: ");
        int sec = sc.nextInt();
       
        
        
        double totalsec=(hour *3600) +( minutes*60) + sec;
        double sms = distance/totalsec;
        System.out.println("Your speed in meters/second is "+sms); 
        
        double skh = (distance / 1000)/(totalsec/3600);
        System.out.println("Your speed in km/h is "+skh );
       
        double smp = (distance/1609)/(totalsec/3600);
        System.out.println("Your speed in miles/h is "+smp);
                
        
    }
    
}
