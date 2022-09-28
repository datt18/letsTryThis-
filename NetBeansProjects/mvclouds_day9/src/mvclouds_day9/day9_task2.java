package mvclouds_day9;

import java.util.Scanner;

class day9_task2 {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
//create a scanner object for input

        System.out.print("Enter the number of rows: ");
        int rows = scan.nextInt();
        for (int i = 1; i <= rows; i++) {   
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
           for (int k = 1; k <= (2 * i - 1); k++) {
                if ( k % 2 != 0) {

                    System.out.print("*");

                } else {

                    System.out.print(i-1);
                }}
            System.out.println();
        }

        for (int i = 1; i <= rows ; i++) {  
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
             for (int k = 1; k <= (2 * i - 1); k++) {
                if ( k==1|| k==(2 * i - 1)  ||k % 2 != 0) {

                    System.out.print("*");
                

                } else {

                    System.out.print(i-1);
                }
            
        }
             System.out.println();
    }
}
}
