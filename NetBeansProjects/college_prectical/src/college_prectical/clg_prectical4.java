 
import java.util.Scanner;


//Write a program that solves the following equation and displays the value x and y:
//1) 3.4x+50.2y=44.5 2) 2.1x+.55y=5.9
//(Assume Cramer’s rule to solve equation 
//ax+by=e x=ed-bf/ad-bc cx+dy=f y=af-ec/ad-bc )
    
public class clg_prectical4{
    public static void main(String[] args){
        
        Scanner in =new Scanner(System.in);
        System.out.print("value of a:");
        double a=in.nextDouble();
         System.out.print("value of b:");
        double b=in.nextDouble();
         System.out.print("value of e:");
        double e=in.nextDouble();
         System.out.print("value of c:");
        double c=in.nextDouble();
         System.out.print("value of d:");
        double d=in.nextDouble();
         System.out.print("value of f:");
        double f=in.nextDouble();
       double x=((e*d)-(b*f))/((a*d)-(b*c));
       double y=((a*f)-(e*c))/((a*d)-(b*c));
        System.out.println("x="+x+"\ty="+y);
        
    }
    
}

