


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class class_and_objects {
    
        static int adition(int x,int y){
            return x+y;
          
        }
        
        static int multiplication(int x, int y){
            return x*y;
        }

        public int substrection(int x , int y){
            return x-y;
            
        }
        public int divition(int x , int y){
            return x/y;
            
        }
        
                

        
        public static void main(String[] args){
            int x,y;
            x=10;
            y=2;
            int num1 = adition(x,y);
            System.out.println("adtion="+num1);
            multiplication(x,y);
             int num2 =multiplication(x,y);
            System.out.println("multiplication="+num2);
            class_and_objects main = new class_and_objects();
            int num3 = main.substrection(x,y);
            System.out.println("substection="+num3);
            int num4 = main.divition(x,y);
            System.out.println("divition="+num4);
             
            
        }
    }
    
   
    

