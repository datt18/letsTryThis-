


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class encapsulation_ex2 {
    public static void main(String[] args) {
        System.out.println("select any choice");
        System.out.println("if you won't to square then press 1");
        System.out.println("if you won't to conver meter to feet then press 2");
        System.out.println("if you won't to square root then press 3");
        System.out.println("if you won't to  area_0f_circle then press 4 ");
        Scanner main = new Scanner(System.in);
        int choice = main.nextInt();
        switch(choice){
            case 1:
                System.out.println("enter the value x");
                run_encapsulation_ex2 obj = new run_encapsulation_ex2();
                int x = main.nextInt();
                obj.setsquare(x);
                
                System.out.println("enter square root of x is:"+obj.getsquare());
                break;
            case 2:
                System.out.println("enter the value of meter");
                System.out.println("enter value in meters:");
                run_encapsulation_ex2 yes  = new run_encapsulation_ex2();
                double meter = main.nextDouble();
                yes.setmeter(meter);
                
                System.out.println(meter+"="+yes.getmeter()+"feets");
                break;
            case 3:
                System.out.println("enter the value z");
                run_encapsulation_ex2 pro = new run_encapsulation_ex2();
                int z = main.nextInt();
                pro.setZ(z);
                System.out.println("square root of z is"+pro.getZ());
            case 4:
                System.out.println("enter the value of redius");
                run_encapsulation_ex2 yoo= new run_encapsulation_ex2();
                int redius = main.nextInt();
                yoo.setradius(redius);
                System.out.println("area of circle is="+yoo.getredius());
                
                
        }
        
        
    }
    
}
