
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class date_example2 {
    public static void main(String[] args) {
        System.out.println("enter the choice ");
        System.out.println("select 1 for yyyy-MM-dd");
        System.out.println("select 2 for dd/MM/yyyy");
        System.out.println("select 3 for dd-MMM-yyyy");
        System.out.println("select 4 for E, MMM dd yyyy ");
//if you use Scanner class in one time and tnen not use is many time .......but not evry time .... evry program


        Scanner a = new Scanner(System.in);
        int choice = a.nextInt();

        switch(choice){
            case 1:
                LocalDateTime myobj = LocalDateTime.now();
                System.out.println("befor formating"+myobj);

                DateTimeFormatter mu  = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

                String formattedDate = myobj.format(mu);
                System.out.println("After formatting: " + formattedDate);
                break;
            case 2:
                LocalDateTime my = LocalDateTime.now();
                System.out.println("befor formating"+my);

                DateTimeFormatter obj3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

                String hii = my.format(obj3);
                System.out.println("After formatting: " + hii);
                break;
            case 3:
                LocalDateTime you = LocalDateTime.now();
                System.out.println("befor formating"+you);

                DateTimeFormatter no = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");

                String hy = you.format(no);
                System.out.println("After Formatting: " +hy);
                break;
            case 4:
                LocalDateTime j = LocalDateTime.now();
                System.out.println("befor formating"+j);

                DateTimeFormatter n = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");

                String m = j.format(n);
                System.out.println("After Formatting: " + m);


        }

    }

}
