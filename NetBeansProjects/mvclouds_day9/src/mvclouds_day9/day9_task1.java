/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvclouds_day9;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class day9_task1 {

    public static void main(String[] args) {

        int i, j, k;
        System.out.println("enter rows");

        Scanner e = new Scanner(System.in);

        int rows = e.nextInt();

        for (i = 1; i <= rows; i++) {

            for (j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                if ( k % 2 != 0) {

                    System.out.print("*");

                } else {

                    System.out.print(i-1);
                }
            }
            System.out.println();
        }
    }
}
