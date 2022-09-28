/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
/*
public class recurtion {
    
    static int n1=0,n2=1,n3=0;      
     static void my(int count){      
        if(count>0){      
             n3 = n1 + n2;      
                   n1 = n2;      
                   n2 = n3;
             System.out.print(" "+n3);     
             my(count-1);      
         }      
     }        
  
  public static void main(String[] args) {
    int count=10;      
      System.out.print(n1+" "+n2);//printing 0 and 1      
      my(count-2);//n-2 because 2 numbers are already printed     
}  
}  
   */
class recurtion{
    static int my(int x){
            if(x>0){
                x++;
                System.out.println(x);
                my(x);
            }
            else{
                return 0;
                
            }
        return 0;
        }
    public static void main(String[] args){
       int x=10;
        System.out.println(x);
        my(x-2);
        
        
    }
}
    
    
