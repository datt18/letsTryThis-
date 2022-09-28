
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
public class hashmap_example1 {
    public static void main(String[] args) {
        HashMap<String , Integer> marksheet = new HashMap< String , Integer>();
        marksheet.put("raj",80);
        marksheet.put("sahil",90);
        marksheet.put("jils",99);
        marksheet.put("rocky",91);
        System.out.println("Hashmap is="+marksheet);
        Scanner h = new Scanner(System.in);
        System.out.println("enter the choice");
        System.out.println("if you wont't to acsses any value then press 1");
        //To access a value in the HashMap, use the get() method and refer to its key
        System.out.println("if you won't remove the value the press 2");
        System.out.println("if you won't to clear the values then press 3");
        System.out.println("if you won't to size of hashmap then press 4");
        System.out.println("if you won't to print the key and values then press 5");
        int choice = h.nextInt();
        switch(choice){
            case 1:
                System.out.println("enter the key thous you won't to acssess that value...");
                Scanner j = new Scanner(System.in);
                String f = j.nextLine();
                
                System.out.println("key is=" +f+  "   it's value = "+marksheet.get(f));
                break;
            case 2:
                System.out.println("enter the key thous you won't to acssess that value...");
                Scanner n = new Scanner(System.in);
                String u = n.nextLine();
                
                System.out.println("key is=" +u+  "   it's value = "+marksheet.get(u));
                break;
            case 3:
                System.out.println("clear the values..");
                marksheet.clear();
                System.out.println(marksheet);
                break;
            case 4:
                System.out.println("size of hashmap is=");
                marksheet.size();
                System.out.println(marksheet);
                break;
            case 5:
                System.out.println("keys and values");
                for(String i: marksheet.keySet()){
                    System.out.println(" key: " + i+" value: " +marksheet.get(i));
                }
                
                
        }
        
        
        
        
    }
    
}
