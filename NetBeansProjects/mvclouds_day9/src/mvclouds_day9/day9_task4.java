
import java.util.Scanner;
 
public class day9_task4
{
    public static int fact(int n){
        int fact=1, i;
        for( i=1; i<=n; i++){
            
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
       
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter Value of n : ");
        
  
        int n = scanner.nextInt();
        System.out.print("Enter Value of r : ");
        int r = scanner.nextInt();
        int c= (fact(n)/(fact(n-r)*fact(r)));
        int p=(fact(n)/(fact(n-r)));
        
 
        System.out.print("permutation (NCR) is :" +p);
        System.out.print("\n combination (NPR) is :" +c);
    }
}