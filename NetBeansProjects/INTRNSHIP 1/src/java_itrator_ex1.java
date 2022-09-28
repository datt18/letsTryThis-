
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class java_itrator_ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> you = new ArrayList<Integer>();
        you.add(5);
        you.add(98);
        you.add(56);
        you.add(30);
        you.add(35);
        you.add(27); 
        System.out.println("Array_list");
        //syntex is most important.....
        Iterator<Integer> d =you.iterator();
        
       
        
        while(d.hasNext()){
            Integer c = d.next();
            if(c<20){
                d.remove();
                System.out.println("Arraylist after 20+"+you);
            
        }
    }
}
}