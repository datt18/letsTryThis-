
package college_prectical;

//Write a program that prompts the user to enter three integers and display the integers in 
//decreasing order.
import java.util.Scanner;
public class clg_prectical7 {
    public static void main(String[] args){
        int temp;
        Scanner input= new Scanner(System.in);
        System.out.println("enter value of a:");
        int a=input.nextInt();
        System.out.println("enter value of b:");
        int b=input.nextInt();
        System.out.println("enter value of c:");
        int c=input.nextInt();
        if(a<b){
            temp=a;
            a=b;
            b=temp;
        }
        if(c>a){
            temp=c;
            c=b;
            b=a;
            a=temp;
        }
        else{
            temp=c;
            c=b;
            b=temp;
        }
          System.out.println("decreasing order: \n"+a+"\n "+b+"\n "+c);
    }
       
    
}
