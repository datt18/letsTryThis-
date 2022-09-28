/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import java.util.*;  
public class method {
    public static int minvalue(int x,int y){
        if(x<y)
            return x;
        else
            return y;
    }
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the velue of frist number:");
        int a=s.nextInt();
        System.out.println("enter the velue of second number:");
        int b=s.nextInt();
        int c=s.nextInt();
        System.out.println("the minimum value is :"+c);
        
        
    }
    
}
