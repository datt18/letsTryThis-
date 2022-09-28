import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class file_ex2 {
    public static void main(String[] args) {
        
        Scanner q = new Scanner(System.in);
        
         File r =new File("filename.txt");
         
        System.out.println("enter your choice");
        System.out.println("if you won't write a file then press 1");
        System.out.println("if you won't read a file then press 2");
        int choice = q.nextInt();
        /////////////////////////////////////////////////////////////////////////////////////////
        switch(choice)
            
        {
            /////////////////////////////////////////////////////////////////////////////////////
            
            case 1:
                System.out.println("write the file");
                try{
            Filewiter w = new Filewiter("filename.txt");
            w.writer("might be trecky");
            w.close();
            System.out.println("successfully done");
        }
        catch (Exception IO)
        {
                   System.out.println("Somthing is wrong");
                   //e.printStackTrace();
       
                }
                break;
 //////////////////////////////////////////////////////////////////////////////////////               
            case 2:
                System.out.println("read the file");
                try{
                   
                    File m = new File("filename.txt");
                     Scanner f = new Scanner(m);
                   while (f.hasNextLine()) {
                         String d = f.nextLine();
                      System.out.println(d);
                     }
                          f.close();
                      } catch (Exception e) {
                          System.out.println("An error occurred.");
                        
                     }

                   }
        
            
        }

    
        
    }
    

