/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */

/*
public class java_arithmatic_exeption {
    public static void main(String[] args) {
        int data=1093/0;
        System.out.println("ans="+data);
    }
}
*/
//in this example any error.. then we hendeling then... use ....arithmetic_exeption...

public class java_arithmatic_exeption {
    public static void main(String[] args) {
        try{
           int data=1093/0;
        System.out.println("ans="+data);
 
        }
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("arithmetic exeption");
            
        }
            }
}