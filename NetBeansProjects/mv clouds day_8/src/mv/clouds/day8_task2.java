/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mv.clouds;

import java.util.*;  
class day8_task2 
        
{  
    public static void main(String args[])   
    {   
        System.out.println("Enter the value of a=");  
        Scanner sc = new Scanner(System.in);  
        
        int a = sc.nextInt();  
          System.out.println("Enter the value of b="); 
        int b = sc.nextInt();  
        System.out.println("before swapping numbers: "+a +"   "+ b);  
       /*Swapping*/  
        a = a + b;   
        b = a - b;   
        a = a - b;   
        System.out.println("After swapping: "+a +"    " + b);   
    }   
}  
