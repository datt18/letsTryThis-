
package college_prectical;
/*Write a program that calculates percentage marks of the student if marks of 6 subjects are 
given
*/


/*import java.util.Scanner;
public class clg_prectical3 {

    private static Object input;
    public static void main(String[] args){
        int marks[]=new int[6];
        int total_marks=0;
        float parcentage=0;
        Scanner in= new Scanner(System.in);
        for (int i=1;i<=6;i++){
            marks[i]=input.nextint();
        }
        for (int i=1;i<=6;i++){
            total_marks=total_marks+marks[i];
            
        }
        parcentage=(total_marks*100)/600;
        System.out.println("stdent percentage="+parcentage);
    }

    
    
}
*/

public class clg_prectical3{
    public static void main(String[] args){
        int m1=23,m2=45,m3=65,m4=67,m5=78,m6=89,t = 0,avg;
        System.out.println("subject 1="+m1);
        System.out.println("subject 2="+m2);
        System.out.println("subject 3="+m3);
        System.out.println("subject 4="+m4);
        System.out.println("subject 5="+m5);
        System.out.println("subject 6="+m6);
        t=m1+m2+m3+m4+m5+m6;
        System.out.println("you total marks is="+t);
        
        avg=t/6;
        System.out.println("\nyour average is="+avg);
    }
}