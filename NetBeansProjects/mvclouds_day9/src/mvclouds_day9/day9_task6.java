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
public class day9_task6 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number if you won't to chaked(only 3 digite):");
        int num = s.nextInt();

        int  mainnum, r, result = 0;

        mainnum = num;
      

        while (mainnum != 0) {
            r = mainnum % 10;
            result += Math.pow(r, 3);
            mainnum /= 10;
        }
//        while (mainnum > 0) {
//            r = mainnum % 10;
//            result = result + (r * r * r);
//            num = num / 10;
//            
//        }

        if (result == num) {
            System.out.println(" is an Armstrong number:" + num);
        } else {
            System.out.println(" is not an Armstrong number:" + num);
        }
    }

}
