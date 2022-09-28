
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class wrapper_calss_ex1 {
    public static void main(String[] args) {
        System.out.println("enter your choice....");
        System.out.println("intiger velue convert String then press 1");
        System.out.println("integer value convert float then press 2");
        System.out.println("float to string yhen press 3");
        System.out.println("double to String value then press 4");
        Scanner v = new Scanner(System.in);
        int choice = v.nextInt();
        switch(choice){
            case 1:
                System.out.println("enter integer value=");
                Integer a=v.nextInt();
                String c = a.toString();
                System.out.println("String is="+c);
                
            case 2:
                System.out.println("enter integer value=");
                Integer z=v.nextInt();
                Float t =z.floatValue();
                System.out.println("float value  is="+t);
            case 3:
                System.out.println("enter float value=");
                Float h =v.nextFloat();
                String g =h.toString();
               
                System.out.println("String is="+g);
            case 4:
                System.out.println("enter double value=");
                Double w = v.nextDouble();
                String d = w.toString();
                System.out.println("String is ="+d);
                
                
               
           

        }
        
    }
    
}
