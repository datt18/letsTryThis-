/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package college_prectical;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class switchcase_use_atm {
    public static void main(String args[]){
        System.out.println("well come to atm");
     int balance=20000, withdraw,deposit;
     Scanner obj = new Scanner(System.in);
        System.out.println("1 for withdraw");
        System.out.println("2  for deposit");
        System.out.println("3 for chack balence");
        System.out.println("select any option");
        
        
     int option =obj.nextInt();
     
     switch(option)
     {
         case 1:
             System.out.println("enter the money you withdraw");
             withdraw = obj.nextInt();
             
             if(balance>=withdraw)
             {
                 balance = balance-withdraw;
                 System.out.println("collect money");
                 System.out.println("remaning balence"+balance);
                 
                 
             }
             else {
                 System.out.println("balence is not avelable");
                 
                 
             }
             break;
         case 2:
             System.out.println("enter money you deposited");
             deposit=obj.nextInt();
             balance=balance+deposit;
             System.out.println("your money deposit sucssesfully");
             System.out.println("updated balance="+balance);
             break;
         case 3:
             System.out.println("balance is="+balance);
             break;
             
            
             
     }
     
     
             
  
    
 
    }
}
