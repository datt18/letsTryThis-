
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/AnnotationType.java to edit this template
 */

/**
 *
 * @author admin
 */
abstract class maths{
    
    public abstract double cal(double redius);
    
       
     }
class yes extends maths{
    double redius;
    public double cal(double redius  ){
        
        double pi = 3.14;
        double z = pi*redius*redius;
         return z;

    }
}


public class abstrect_class {
    public static void main(String[] args) {
            System.out.println("enter the value of redius");
            Scanner main = new Scanner(System.in);
            double redius = main.nextDouble();
            
     yes no = new yes();
     no.cal(redius);//pass the redius 
      
     
    System.out.println("area="+no.cal(redius));
    }
    
    
}
