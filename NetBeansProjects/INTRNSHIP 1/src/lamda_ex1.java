
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
//lamda is a function that use instantly
/*
 interface which has only one method. The lambda expression should have 
the same number of parameters and the same return type as that method.
Java has many of these kinds of interfaces built in, such as the Consumer interface.
*/
public class lamda_ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        num.add(100);
       num.forEach( (n) -> { System.out.println(n); } );
    }
}
