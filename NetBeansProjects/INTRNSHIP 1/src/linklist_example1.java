

import java.util.LinkedList;
import java.util.Scanner;


public class linklist_example1 {
    public static void main(String[] args) {
         LinkedList<String> n = new LinkedList<String>(); //not you wepper class
         n.add("raj");
         n.add("sahil");
         n.add("sachin");
         n.add("rocky");
         n.add("jils");
         System.out.println("LinkedList="+n);
         Scanner y = new Scanner(System.in);
         System.out.println("enter your choice");
         System.out.println("if you won't add frist then press 1");
          System.out.println("if you won't add last then press 2");
           System.out.println("if you won't remove value frist position then press 3");
           System.out.println("if you won't remove value last position then press 4");
            System.out.println("if you won't get frist element from linked list then  press 5");
            System.out.println("if you won't get last element from linked list then  press 5");
            
         int choice = y.nextInt();
         switch(choice){
             case 1:
                 System.out.println("enter the value you won't to add frist");
                 Scanner o = new Scanner(System.in);
                 String f = o.nextLine();
                 System.out.println(f);
                 n.addFirst(f);
                 System.out.println("new_linkedList="+n);
                 break;

             case 2:
                 System.out.println("enter the location of value add last ");
                 Scanner i = new Scanner(System.in);
                 String h = i.nextLine();
                 n.addLast(h);
                 System.out.println("new_linkedList="+n);
                 break;
             case 3:
                 System.out.println(" remove frist .... ");
                 n.removeFirst();
                 System.out.println("new_linkedList="+n);
                 break;
             case 4:
                 System.out.println("remove last element from list... ");
                 n.removeLast();
                
                 System.out.println("new_linkedList="+n);
                 break;
             case 5:
                 System.out.println("frist value of linkedlit");
                 System.out.println(n.getFirst());
                 System.out.println("new_Linkedlist is="+n);
                 break;
                 
             case 6: 
                 System.out.println("last velue of linked list");
                 
                 System.out.println(n.getLast());
                 System.out.println("new_Linkdlist is="+n);
                 
               
         }
    }
    
}
