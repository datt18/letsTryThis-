
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class java_NumberFormatException_ex {
    
    public static void main(String[] args) {
        try{
            String b="123";
             int i=Integer.parseInt(b);
        }
        catch(NumberFormatException e){
            System.out.println(e);
            System.out.println("NumberFormatException ");
            
        }
        
        
        
        
    }
}
