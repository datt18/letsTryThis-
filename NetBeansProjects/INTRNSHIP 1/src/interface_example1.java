
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */

interface good{
    public int ms(int z);
}
interface very_good{
    public double os(double metar);
}
interface hii{
    public int woo(int x);
}
class main implements good,very_good,hii{

    int z;
    double meter;
    int x;
    public int ms(int z){
            z=(int) Math.sqrt(z);
            return z;
}
    public double os(double metar){
        
        double y =3.3320;
        double n=metar*y;
        return n;         
}
    public int woo(int x){
         return x*x;
        
    }

}

public class interface_example1 {
    public static void main(String[] args) {
         System.out.println("select any choice");
         System.out.println("if you won't to square root then press 1");
         System.out.println("if you won't to conver meter to feet then press 2");
         System.out.println("if you wont't to square then press 3");
        Scanner yoo = new Scanner(System.in);
        int choice = yoo.nextInt();
        main obj1 = new main();
        switch(choice){
            case 1:
                   System.out.println("enter the velue thous you won't to square root ...z =");
                   int z = yoo.nextInt();
                   System.out.println("the square root of z is="+obj1.ms((int) z));
                    break;
            case 2:
                    System.out.println("enter the velue of meeter");
                    double metar = yoo.nextDouble();
                    System.out.println("feet="+obj1.os(metar));
                     break;
            case 3: 
                    System.out.println("enter the velue of x=");
                    int x = yoo.nextInt();
                    System.out.println("the square of x is="+obj1.woo(x));
                     break;
                    
                
        
        }   
    }
    
}
