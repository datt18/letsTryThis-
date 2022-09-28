/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
//An enum can, just like a class, have attributes and methods. The only difference is that enum 
//        constants are public, static and final (unchangeable - cannot be overridden).
//
//An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).
public class java_enum {
    enum yes {
        HELLO,
        HII,
    }
    public static void main(String[] args){
       yes obj = yes.HELLO;
        System.out.println("hellooooo"+obj);
         yes obj2 = yes.HII;
        System.out.println();
    } 
    
}
