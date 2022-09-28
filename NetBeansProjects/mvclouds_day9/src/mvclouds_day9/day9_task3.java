/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvclouds_day9;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class day9_task3 {
    public static void main(String[] args) {
        System.err.println("Enter the name :");
        Scanner n = new Scanner(System.in);
        String str = n.nextLine();
//         n.close();
        String re = fun(str);
        System.out.println("ans:" + re);
    }
    public static String fun(String str){
        if(str.isEmpty()){
            return str;
        }
        
        return fun(str.substring(1)) + str.charAt(0);
        
    }
}
