/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
/*
why we need constrocter
Constructors must have the same name as the class within which it is defined 
while it is not necessary for the method in Java.
Constructors do not return any type while method(s) have the return type
or void if does not return any value.
Constructors are called only once at the time of Object creation while method(s)
can be called any number of times.
*/
/*
public class constructer {
     int x;
    public constructer(){
        
        int x=11;
    }
    public static void main(String[] args) {
      
        constructer obj = new constructer();
        System.out.println(obj.x);

    }
    
    
}

*/
public class constructer {
     int x;
    public constructer(int y){
        
        int x=y;
    }
    public static void main(String[] args) {
      
        constructer obj = new constructer(11);
        System.out.println(obj.x);

    }
    
    
}