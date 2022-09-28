
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
When an array exceeds to it's size, the ArrayIndexOutOfBoundsException occurs. 
there may be other reasons to occur ArrayIndexOutOfBoundsException. 
Consider the following statements.
*/
public class java_ArrayIndexOutOfBoundsException_ex {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
       try{
            int s[] ={12,23,34,56};
                    
            System.out.println("array s ="+s);
            System.out.println("enter the location... you wont element");
            int i = a.nextInt();
            System.out.println(s[i]);
       
       //string s is in only 3 element end we wont location 10 number element... then it is show error
    }
       catch(ArrayIndexOutOfBoundsException e){
           System.out.println(e);
           System.out.println("error.... increct input");
           
           
       }
    }
}
