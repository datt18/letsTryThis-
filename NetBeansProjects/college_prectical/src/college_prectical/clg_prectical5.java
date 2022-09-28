
package college_prectical;
//Write a program that reads a number in meters, converts it to feet, and displays the result.


import java.util.Scanner;
public class clg_prectical5 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        double meter = input.nextDouble();
        System.out.println("enter value in meters:");
        double feet = meter* 3.28082;
        System.out.println(meter+"= meters\n"+feet+"feets");
        
    }
    
}
