import java.util.Scanner;
public class DAY_1_PROJECT {
    public static void main(String args[]){
        System.out.println("well come to atm");
        System.out.println("insert atm card");
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the password");
        String password = obj.nextLine();
        System.out.println("password is="+password);
        
        
    if(password.length()==4)
    {    
     int balance=20000, withdraw,deposit;
     
        System.out.println("1 for withdraw");
        System.out.println("2  for deposit");
        System.out.println("3 for chack balence");
        System.out.println("select any option");
        
     int option =obj.nextInt();
       
           switch(option)
         {
         case 1:
             System.out.println("enter the money you withdraw");
             withdraw = obj.nextInt();
             
             if(balance>=withdraw)
             {
                 balance = balance-withdraw;
                 System.out.println("collect money");
                 System.out.println("remaning balence"+balance);
                 
                 
             }
             else {
                 System.out.println("balence is not avelable");
                 
                 
             }
             break;
         case 2:
             System.out.println("enter money you deposited");
             deposit=obj.nextInt();
             balance=balance+deposit;
             System.out.println("your money deposit sucssesfully");
             System.out.println("updated balance="+balance);
             break;
         case 3:
             System.out.println("balance is="+balance);
             break;
             
            
         } 
     }
    else {
        System.out.println("incuurect password");
    }
     

    }
}
