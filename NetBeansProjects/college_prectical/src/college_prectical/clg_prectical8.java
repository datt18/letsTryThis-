
package college_prectical;

//Write a program that prompts the user to enter a letter and check whether a letter is a 
//vowel or constant
import java.util.Scanner;
public class clg_prectical8 {
    public static void main(String[] args){
        System.out.println("enter the character");
        Scanner input= new Scanner(System.in);
        char ch = input.next();
       if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u'){
           System.out.println("given numer is vowel");  
       }
       else{
           System.out.println("given numer is consonant");
       }
        
    }
    
}
