/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class even_or_odd_numberis {
    public static void main(String[] args){
        System.out.println("enter the value:");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        if(num%2==0)
            System.out.println("the number is even");
        else
            System.out.println("the number is odd");
        
        
    }
    
}
