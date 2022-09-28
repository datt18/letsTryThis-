
import javax.lang.model.SourceVersion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
/*method*/
/*
public class method {
    static void my(){
        System.out.println("datt");
    }
    public static void main(String[] args){
        my();
        
    }
}
*/
/* note--->>>when we use static method then we directly call main method but 
when... we use public method then we need to create object and then call 
*/
/*
public class method {
    public void my(){

        System.out.println("hello");

    }
    public static void main(String[] args){
         method obj = new method();
        obj.my();
        
    }
*/
    
/*method with parameters*/
public class method {
    static void my( String name , int enrollment_no ){
        System.out.println(name+ "enrollment is "+enrollment_no);
    }
    public static void main(String[] args){
        my("datt",20);
        my("raj",22);   
        
    }
}

