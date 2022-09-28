/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
//If we have a null value in any variable, performing 
//any operation on the variable throws a NullPointerException.


public class java_nullpointer_exeption_ex {
    public static void main(String[] args) {
        try{
            String s= null;
        System.out.println(s.length());
        }
        catch(NullPointerException e){
            System.out.println(e);
            System.out.println("somting any problem");
        }
        
    }
    
}
