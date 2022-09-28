/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mv.clouds;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class day8_task10 {
    public static void main(String[] args) {
         int rows, cols;  
        Scanner sc = new Scanner(System.in);  
        System.out.println("Please enter odd numbers for rows and colums to get perfect Swastika.");  
        System.out.println("Enter total rows if you won't:");  
        rows = sc.nextInt();  
        System.out.println("Enter total colums if you won't:");  
        cols = sc.nextInt();  
          
          

        for (int u = 0; u < rows; u++) {  
            for (int v = 0; v < cols; v++)  
            {  
                // check whether u is less than from half of rows or not  
                if (u < rows / 2)  
                {  
                    // check whether v is less than from half of cols or not  
                    if (v < cols / 2)  
                    {  
                        // print '*' if v == 0  
                        if (v == 0)   
                        {  
                            System.out.print("*");  
                        }  
                        // else we print space  
                        else   
                        {  
                            System.out.print(" "+ " ");  
                        }  
                    }  
                    // check whether v is equal to half of cols or not  
                    else if (v == cols / 2)   
                    {  
                        System.out.print(" *");  
                    }  
                    else  
                    {  
                        // u = 0 denotes 1st row that will have '*'  
                        if (u == 0)  
                            System.out.print(" *");  
                    }  
                }  
                // check whether u is equal to half of rows or not  
                else if (u == rows / 2) {  
                    System.out.print("* ");  
                }  
                else  
                {  
                    // When u > rows/2, the middle and last column will have '*'  
                    if (v == cols / 2 || v == cols - 1)  
                    {  
                        System.out.print("* ");  
                    }  
                    else if (u == rows - 1)  
                    {  
                        // if v <= cols/2 OR if it is last column, the last row will be have '*'  
                        if (v <= cols / 2 || v == cols - 1)   
                        {  
                            System.out.print("* ");  
                        }  
                        else {  
                            System.out.print(" "+ " ");  
                        }  
                    }  
                    else  
                    System.out.print(" "+" ");  
                }  
            }  
            System.out.print("\n");  
        }  
    }
    
}
