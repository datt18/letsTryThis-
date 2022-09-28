
import java.io.File;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class delete_fileex2 {
    public static void main(String[] args) {
        File n = new File("C:\\Users\\admin\\Downloads\\New folder");
        if(n.delete()){
            System.out.println("file will be deleted.."+n.getName());
            
        }
        else{
            System.out.println("somthing is wrong");
        }
        
    }
    
}
