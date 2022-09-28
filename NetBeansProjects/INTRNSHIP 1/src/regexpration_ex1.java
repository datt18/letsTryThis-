
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class regexpration_ex1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter your name");//frint latter is capital
        String name =a.nextLine();
        String nu = "^[A-Z]{1}[a-z]{3,10}$";
        String en = "^[0-9]{12}$";
        String mo = "^[+91]{3}[0-9]{10}$";
        String ps ="^[A-Z]{1}[a-z0-9]{5}";
        String pi ="^[0-9]{6}$";
        String ci ="^[A-Za-z]{1,10}$";
        
        //////////////////////////////
        Pattern p1 = Pattern.compile(nu);
        Matcher m1 = p1.matcher(name);
        boolean matcherfound =  m1.find();
        if(matcherfound){
            System.out.println("name is valid ");
            
        }
        else{
            System.out.println("any problem... enter your name like - ex-'Datt'");
        }
       ///////////////////////////////////////////////////////////
        System.out.println("enter your enrollment number=");
        String enn=a.nextLine();
        Pattern p2 = Pattern.compile(en);
        Matcher m2 = p2.matcher(name);
        boolean matcherfound2 =  m2.find();
        if(matcherfound2){
            System.out.println("enrollment no. is valid");
        }
        else{
            System.out.println("somthing want wong");
        }
        
        ////////////////////////////
        System.out.println("enter your moblie no");
        String moblie = a.nextLine();
        Pattern p3 = Pattern.compile(mo);
        Matcher m3 = p3.matcher(moblie);
        boolean matcherfound3 =  m3.find();
        if(matcherfound3){
            System.out.println("moblie no is valid");
            
        }
        else{
            System.out.println("somthing want worng....'ex- +91 9876543210'");
        }
        /////////////////////////////////////
        System.out.println("enter the password ");//password is more then 6  to 10 digit
        String password = a.nextLine();
        Pattern p4 = Pattern.compile(ps);
        Matcher m4 = p4.matcher(password);
        boolean matcherfound4 =  m4.find();
        if(matcherfound4){
            System.out.println("password is currect");
            
        }
        else{
            System.out.println("somting want wrong... 'ex=Abs123'");
        }
        /////////////////////////////////////////////////
        System.out.println("enter your pincode no=");
        String pin=a.nextLine();
        Pattern p5 = Pattern.compile(pi);
        Matcher m5 = p5.matcher(pin);
        boolean matcherfound5 =  m5.find();
        if(matcherfound5){
            System.out.println("pincod is currect");
            
        }
        else{
            System.out.println("somthing is wrong..... 'ex-202012'");
        }
        System.out.println("enter your city");
        String city = a.nextLine();
        Pattern p6 = Pattern.compile(ci);
        Matcher m6 = p6.matcher(city);
        boolean matcherfound6 =  m6.find();
        if(matcherfound3){
            System.out.println("enter deitails is currect");
            
        }
        else{
            System.out.println("somthing is wrong.. ... EX-'Unjha'");
        }
    }
    
}
