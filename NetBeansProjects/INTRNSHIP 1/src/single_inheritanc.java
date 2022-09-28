import java.time.LocalDate;
import java.util.*;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public  class single_inheritanc {

    public static void main(String[] args) {
        int d, m, y;
        Scanner s = new Scanner(System.in);
        System.out.println("enter your year");
        y = s.nextInt();
        System.out.println("enter your month");
        m = s.nextInt();
        System.out.println("enter your date");
        d = s.nextInt();
        LocalDate dob = LocalDate.of(y, m, d);
        System.out.println("your age is"+age_value(dob));

    }

        static String age_value(LocalDate dob){
            LocalDate current_date =  LocalDate.now();
            int value1 = Period.between(dob,current_date).getYears();
            int value2 = Period.between(dob,current_date).getMonths();
            int value3 = Period.between(dob,current_date).getDays();
            String  result =  value1+" year "+  value2+ " month " +value3 +" days";

            return result ;

        }
}