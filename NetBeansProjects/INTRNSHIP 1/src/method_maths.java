/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
/*
using method  maths calculation
*/
import java.util.*;

public class method_maths {
    static int square(int x){
        return x*x;
    }
    static double feet(double meter){
        double y = 3.28082;
        return meter*y ;
    }
    static double square_root(double z){
        
       z=Math.sqrt(z);
               
        return z;
            
        }
    public double area_0f_circle(int redius){
        double pi = 3.14;
        return redius*redius*pi;
        
    }
    
    
    
    public static void main(String[] args){
        System.out.println("select any choice");
        System.out.println("if you won't to square then press 1");
        System.out.println("if you won't to conver meter to feet then press 2");
        System.out.println("if you won't to square root then press 3");
        System.out.println("if you won't to  area_0f_circle then press 4 ");
        Scanner main = new Scanner(System.in);
        int choice = main.nextInt();
        
        switch(choice){
            case 1:
                System.out.println("enter the value of x:");
                int x = main.nextInt();
                int a = square(x);
                System.out.println("the square of x is="+a);
                break;
            case 2:
                System.out.println("enter the value of meter");
                double meter = main.nextDouble();
                System.out.println("enter value in meters:");
                double feet = feet(meter);
                System.out.println(meter+"= meters\n"+feet+"feets");
                break;
            case 3:
                System.out.println("enter the value z");
                Scanner m = new Scanner(System.in);
                 double z = m.nextDouble();
                 double b = square_root(z);
                System.out.println("enter square root of z is:"+b);
                break;
            case 4:
                System.out.println("enter the value of redius");
                int redius = main.nextInt();
                method_maths now = new method_maths();
                double c =  now.area_0f_circle(redius);
                System.out.println("area of circal is ="+c);
                
        }
        
           
            
                
    }

    

    

    

    

   

    

    

   
    
}
