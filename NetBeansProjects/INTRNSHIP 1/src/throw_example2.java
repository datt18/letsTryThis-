

import java.util.Scanner;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class throw_example2{
    static void hello(int w){
        
        if(w!=0)
            
        {
                    throw new ArithmeticException("Arithmetic exeption");

        }
        else{
            System.out.println("No Issues");
        }
  
       
        
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter numerator =");
        int d = a.nextInt();
        System.out.println("enter denomneter=");
        int z = a.nextInt();
        int t=d/z;
        
         hello(t);
        System.out.println("ans is="+t);
      
        
        
    }
    
}
