
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class file_ex1 {
    public static void main(String[] args) {
       try{
           File obj  = new File("filename.txt");
           if(obj.createNewFile())
           {
               System.out.println("File is created:"+obj.getName());    
           }
           else{
               System.out.println("File alredy exists.");
           }
           }
       catch (IOException e){
                   System.out.println("error");
                   e.printStackTrace();
       

                   }
    }
    
}
