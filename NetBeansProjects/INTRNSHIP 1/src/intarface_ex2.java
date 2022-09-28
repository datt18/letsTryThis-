
import java.util.Scanner;
interface activa{
    public void activa4g();
    public void activa5g();
    public void activa6g();
}
interface bike{
    public void  bike_ktm();
    public void  bike_bullet();
}

class hello implements activa,bike{
    public void activa4g(){
        System.out.println("best speed= 120");
        System.out.println("leg sspace 3'-3'");
        System.out.println("2 colors... black and white");
    }
    public void activa5g(){
        System.out.println("best speed= 140");
        System.out.println("leg sspace 4'-3'");
        System.out.println("3 colors... black , white and red");
    }
    public void activa6g(){
        System.out.println("best speed= 160");
        System.out.println("leg sspace 4'-4'");
        System.out.println("4 colors... black ,white,blue,red");
    }
    public void bike_ktm(){
        System.out.println("bike ktm");
        System.out.println("best speed= 160");
        System.out.println("engine 100cc");
        System.out.println("4 colors... black ,white,blue,red");
        
    }  
    public void bike_bullet(){
        System.out.println("bike ktm");
        System.out.println("best speed= 160");
        System.out.println("engine 100cc");
        System.out.println("4 colors... black ,white,blue,red");
        
    }  

    hello() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

public class intarface_ex2 {
    public static void main(String[] args) {
              System.out.println("select any choice");
              System.out.println("enter 1 for activa 3g");
              System.out.println("enter 2 for activa 5g");
              System.out.println("enter 3 for activa 6g");
              System.out.println("enter 4 for bike ktm");
              System.out.println("enter 5 for bike bullet");
              
               
            Scanner yes = new Scanner(System.in);
        int choice = yes.nextInt();     
        hello obj1 = new hello();
        
        switch(choice){
            case 1:
                obj1.activa4g();
                break;
            case 2:
                obj1.activa5g();  
                break;
            case 3:
                obj1.activa6g();
                break;
            case 4:
                obj1.bike_ktm();
                break;
            case 5:
                obj1.bike_bullet();
                break;
    
        }
    }
}
    

