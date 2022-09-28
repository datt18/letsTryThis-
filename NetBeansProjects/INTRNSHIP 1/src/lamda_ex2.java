
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
interface patel{
    Scanner jio = new Scanner(System.in);
    int a = jio.nextInt();
    int b = jio.nextInt();
    int add(int a,int b);
}
public class lamda_ex2 {
    public static void main(String[] args){
        System.out.println("if you wont to add then press 1");
        System.out.println("if you wont to substrction then press 2");
        System.out.println("if you wont to multipication then press 3");
        System.out.println("if you wont't to divestion then press 4");
        Scanner jio = new Scanner(System.in);
        int choice = jio.nextInt();
        switch(choice)
                {
                    case 1:
                        System.out.println("enter the value of a and b");
                         
                          patel u=(a,b)->(a+b);
                          System.out.println(u.add(10,20));
                          
                    
        
        
    }
       
       
    }

    
}
