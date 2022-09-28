/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class menegment_system {
    public static void main(String[] args) {
        Scanner main = new Scanner(System.in);
        System.out.println("hello... well com to shop");
        System.out.println("only for man");
        
        System.out.println("t-shirts");
        System.out.println("shirts");
        System.out.println("pent");
        System.out.println("select any one");
        
        int choice = main.nextInt() ;
        double price,fprice,pricex;
        
        double gst= 0.18;
        
        
        switch(choice){
            case 1:
                System.out.println("select any one t-shirt");
                    System.out.println("1 for adidas");
                    System.out.println("2 for  us-polo");
                    System.out.println("3 for 7 nike");
                    int  tshirt = main.nextInt();
                    if(tshirt==1){
                        System.out.println("selected t shirt is adidas");
                        pricex=300;
                        System.out.println("price is="+pricex);
                        System.out.println("select quantity");
                        int a = main.nextInt();
                        price= pricex+(pricex*gst);
                        
                        fprice=price*a;
                        System.out.println(fprice);
                    }
                    if(tshirt==2){
                        System.out.println("selected t shirt is us-polo ");
                        pricex=500;
                        System.out.println("price is="+pricex);
                        System.out.println("select quantity");
                        int b = main.nextInt();
                        price= pricex+(pricex*gst);
                        fprice=price*b;
                        System.out.println(fprice);
                    }
                    if(tshirt==3){
                        System.out.println("selected t shirt is nike ");
                        pricex=1100;
                        System.out.println("price is="+pricex);
                        System.out.println("select quantity");
                        int c = main.nextInt();
                        price= pricex+(pricex*gst);
                        fprice=price*c;
                        System.out.println(fprice);     
                        
                    }
                    break;
                    
            case 2:
                System.out.println("select any one pent");
                    System.out.println("1 for adidas");
                    System.out.println("2 for  us-polo");
                    System.out.println("3 for 7 nike");
                    int  shirt = main.nextInt();
                    if(shirt==1){
                        System.out.println("selected t shirt is adidas");
                        pricex=300;
                        System.out.println("price is="+pricex);
                        System.out.println("select quantity");
                        int a = main.nextInt();
                        price= pricex+(pricex*gst);
                        fprice=price*a;
                        System.out.println(fprice);
                    }
                    if(shirt==2){
                        System.out.println("selected t shirt is us-polo ");
                        pricex=500;
                        System.out.println("price is="+pricex);
                        System.out.println("select quantity");
                        int b = main.nextInt();
                        price= pricex+(pricex*gst);
                        fprice=price*b;
                        System.out.println(fprice);
                    }
                    if(shirt==3){
                        System.out.println("selected t shirt is nike ");
                        pricex=500;
                        System.out.println("price is="+pricex);
                        System.out.println("select quantity");
                        int c = main.nextInt();
                        price= pricex+(pricex*gst);
                        fprice=price*c;
                        System.out.println(fprice);     
                        
                    }
                    break;
            case 3:
                System.out.println("select any one pent");
                    System.out.println("1 for adidas");
                    System.out.println("2 for  us-polo");
                    System.out.println("3 for 7 nike");
                    int  pent = main.nextInt();
                    if(pent==1){
                        System.out.println("selected t shirt is adidas");
                        pricex=1200;
                        System.out.println("price is="+pricex);
                        System.out.println("select quantity");
                        int a = main.nextInt();
                        price= pricex+(pricex*gst);
                        fprice=price*a;
                        System.out.println(fprice);
                    }
                    if(pent==2){
                        System.out.println("selected t shirt is us-polo ");
                        pricex=900;
                         System.out.println("price is="+pricex);
                        System.out.println("select quantity");
                        int b = main.nextInt();
                        price= pricex+(pricex*gst);
                        fprice=price*b;
                        System.out.println(fprice);
                    }
                    if(pent==3){
                        System.out.println("selected t shirt is nike ");
                        pricex=700;
                        System.out.println("price is="+pricex);
                        System.out.println("select quantity");
                        int c = main.nextInt();
                        price= pricex+(pricex*gst);
                        fprice=price*c;
                        System.out.println(fprice);     
                        
                    }
                    break;        
                    
        } 
    }
    
}
