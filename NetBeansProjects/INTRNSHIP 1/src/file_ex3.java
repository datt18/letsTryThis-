
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class file_ex3 {
    public static void main(String[] args) {
         try {
      File b = new File("filename.txt");
      Scanner m = new Scanner(b);
      while (m.hasNextLine()) {
        String data = m.nextLine();
        System.out.println(data +"/n");
        String l1 = "hello";
       String l2 = "i am datt";
        String out = l1 + "\n" + l2;
          System.out.println(out);
          
      }
      m.close();
    } catch (Exception IO) {
      System.out.println("An error occurred.");
             System.out.println(IO);
      
    }
        
    }
    
}
