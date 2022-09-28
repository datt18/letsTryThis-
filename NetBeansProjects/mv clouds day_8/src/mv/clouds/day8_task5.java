/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mv.clouds;

/**
 *
 * @author admin
 */
// Java Program to Sort Names in an Alphabetical Order
import java.io.*;
import java.util.*;

class day8_task5 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("enter the string if you won't sort: ");
        
        String name = sc.nextLine();
        char alfa[] = name.toCharArray();
        Arrays.sort(alfa);
        System.out.println(alfa);
        
           }
}
