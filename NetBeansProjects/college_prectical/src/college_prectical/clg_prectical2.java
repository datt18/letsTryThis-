package college_prectical;

import java.util.Scanner;

//Write a program to convert rupees to dollar. 70 rupees=1 dollar.
public class clg_prectical2 {

    
    public static void main(String[] args){
        float ruppes;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ruppes=");
       ruppes = in.nextLong();
        float dollars = ruppes/70;
        System.out.println("dollars="+dollars);
        
          
        
    }
    
}
