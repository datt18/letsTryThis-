
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class java_arraylist_ex1 {
    public static void main(String[] args) {
         ArrayList<String> n = new ArrayList<String>(); //not you wepper class
         n.add("raj");
         n.add("sahil");
         n.add("sachin");
         n.add("rocky");
         n.add("jils");
         System.out.println("ArrayList="+n);
         Scanner y = new Scanner(System.in);
         System.out.println("enter your choice");
         System.out.println("if you won't add then press 1");
          System.out.println("if you won't remove then press 2");
           System.out.println("if you won't get value then press 3");
            System.out.println("if you won't change the value for any location then press 4");
         int choice = y.nextInt();
         switch(choice){
             case 1:
                 System.out.println("enter the value you won't to add ");
                 Scanner o = new Scanner(System.in);
                 String f = o.nextLine();
                 System.out.println(f);
                 n.add(f);
                 System.out.println("new_ArrayList="+n);
                 break;

             case 2:
                 System.out.println("enter the location of value remove ");
                 Scanner i = new Scanner(System.in);
                 String h = i.nextLine();
                 n.remove(h);
                 System.out.println("new_ArrayList="+n);
                 break;
             case 3:
                 System.out.println("enter the location you won't get the value");
                 Scanner k = new Scanner(System.in);
                 int v = k.nextInt();
                 n.get(v);
                 System.out.println("new_ArrayList="+n);
                 break;
             case 4:
                 System.out.println("enter the location you won't to change the value ");
                 Scanner z = new Scanner(System.in);
                 int t = z.nextInt(); 
                 System.out.println("enter new add value");
                 Scanner b = new Scanner(System.in);
                 String d = b.nextLine();
                 n.set(t,d);
                 System.out.println("new_ArrayList="+n);
                 break;
                 
               
         }
    }
    
}
