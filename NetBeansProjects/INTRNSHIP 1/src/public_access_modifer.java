/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
// if we declare any variable as publicaly than we use evry were in program 
/*
class no{
     int a=3;
    static void main(){
        System.out.println("hello i am datt");
        
    }
    }

public class public_access_modifer {
    public static void main(String[] args) {
        
        System.out.println(a);
        main();
    }
    
}
*/
class no{
    public int a=3;
    public void main(){
        System.out.println("hello i am datt");
        
    }
    }

public class public_access_modifer {
    public static void main(String[] args) {
        no obj = new no();
        System.out.println(obj.a);
        obj.main();
    }
}
    


