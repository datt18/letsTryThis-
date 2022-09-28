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

public class day8_task4 {
     public static void main(String []args)
     {
        //Take input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=sc.nextLine();    //Initialize the String
        
        char[] s = str.toCharArray();  
        StringBuffer stringBuffer = new StringBuffer();  
        for (int i = 0; i < s.length; i++) 
        {  
            if ((s[i] != ' ') && (s[i] != '\t')) 
            {  
                stringBuffer.append(s[i]);  
            }  
        }  
        //Print the string after the removal of white space
        String str2 = stringBuffer.toString();  
        System.out.println("ans : "+str2);  
        
     }
    
}
