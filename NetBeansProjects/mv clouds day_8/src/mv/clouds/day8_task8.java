/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mv.clouds;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class day8_task8 {

    public static void main(String[] args) {
        
        
        int i, j, k;
         System.out.println("enter rows");
        Scanner e = new Scanner(System.in);
         int rows =  e.nextInt();
        for (i = 1; i <= rows; i++) {
            for (j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || i == rows || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
