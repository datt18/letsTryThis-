
import java.io.File;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class delete_file_ex1 {
    public static void main(String[] args) {
        File my = new File("filename.txt");
        if(my.delete()){
            System.out.println("file will be deleted   ....."+my.getName());
        }
            else{
            System.out.println("failed to delete the file...... somthing is wrong");
                    
                    }
    }
    
}
