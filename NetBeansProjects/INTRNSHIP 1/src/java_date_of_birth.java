import java.time.LocalDate;
import java.util.*;
import java.time.Period;
import java.time.format.DateTimeFormatter;

 //netflix use 

public  class java_date_of_birth {
    //this is a method ....
    static String age_value(LocalDate dob){
            LocalDate current_date =  LocalDate.now();
            int value1 = Period.between(dob,current_date).getYears();
            int value2 = Period.between(dob,current_date).getMonths();
            int value3 = Period.between(dob,current_date).getDays();
            String  result =  value1+" year "+  value2+ " month " +value3 +" days";

            return result ;

        }
    
//main method...
    public static void main(String[] args) {
        int d, m, y;
        
        Scanner yes = new Scanner(System.in);
        System.out.println("enter name=");
        String name = yes.nextLine();
        System.out.println("Hello "+name+"well come to netflix");
        System.out.println("only 18+ are use netflix...");
        System.out.println("plese enter your birth_date");
        
        System.out.println("enter your birth year");
        y = yes.nextInt();
        System.out.println("enter your birth month");
        m = yes.nextInt();
        System.out.println("enter your birth date");
        d = yes.nextInt();
        
        LocalDate dob = LocalDate.of(y, m, d);
        if(y>18){
            System.out.println("well come to netflix now you can eligeble for use netflix"); 
        }
        else{
            System.out.println("sorry...you are not 18+ then not use netflix..");
        }
        
        

    }

       
}