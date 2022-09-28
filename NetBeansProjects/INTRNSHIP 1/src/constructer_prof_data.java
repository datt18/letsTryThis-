/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class constructer_prof_data {
    
    public constructer_prof_data(String name , int salary , int age){
        System.out.println("name="+name);
        System.out.println("salary is="+salary);
        System.out.println("Age="+age);
      
    }
    
    public static void main(String[] args) {
        Scanner main = new Scanner(System.in);
        System.out.println("enter the name professer ");
        String name = main.nextLine();
        System.out.println("enter the age of professer");
        int age = main.nextInt();
        System.out.println("enter the salary of professer");
        int salary = main.nextInt();
        
      constructer_prof_data obj = new constructer_prof_data(name,salary,age);
      
        }
    }
    

