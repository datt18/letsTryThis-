
import java.util.HashMap;
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */


    

public class hashmap_example2 {
    static void get_v(){
        HashMap<String , Integer> name = new HashMap< String , Integer>();
        //name and age
        name.put("raj", 18);
         name.put("smit", 19);
          name.put("jils", 43);
           name.put("harsh", 54);
         int h =name.size();
         
         System.out.println("age is"+h);
         
     
        
    }
    
    public static void main(String[] args) {
       
           System.out.println("enter the kye");
           Scanner g = new Scanner(System.in);
           String j  = g.nextLine();
           

           get_v();
           
           
           
           
        
    }
    
}
