
package college_prectical;
import java.util.Scanner;
//Write a program to count the number of words that start with capital letters. 
public class clg_prectical6 {
    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);
        String s= new String();
        System.out.println("Enter line:");
        s=a.nextLine();
        char c;
        int ct=0;
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            //this method return charcter at 
            //specified index
            if(c>=65&&c<=90){
                
                ct++;
                
            }
        }
        System.out.println("total number of lettera in capital:"+ct);
        
    }
    
}
