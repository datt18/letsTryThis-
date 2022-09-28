
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
/*
In Java, it is also possible to nest classes (a class within a class). 
The purpose of nested classes is to group classes 
that belong together, which makes your code more readable and maintainable.
*/
class outerclass {
   int x;
   

class inerrclass{
       int y;        
    }
    
}

public class inerr_class {
    public static void main(String[] args) {
        
        outerclass out = new outerclass();
        outerclass.inerrclass inerr = out.new inerrclass();
        
        Scanner main = new Scanner(System.in);
        System.out.println("enter the velue of x:");
        out.x = main.nextInt();
        System.out.println("enter the velue of :");
        inerr.y = main.nextInt();
                
        
        int z=out.x + inerr.y;
        System.out.println("ans="+z);
        
        
        
        
    }
    
    
}
