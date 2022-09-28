/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class day_2_method_overloding {
    static int adition(int x,int y){
        return x+y;
    }
    static double adition(double x,double y){
        return x+y;
    }
    
    public static void main(String[] args) {
        int num1=adition(1,2);
        double num2=adition(1.0,2.0);
        System.out.println(num1);
         System.out.println(num2);
   
    }

}






