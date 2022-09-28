/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
/*day 2 project*/
import java.util.Scanner;
public class bile_managment {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        System.out.println("well come to hotel ");
        System.out.println("1 for pizzaa");
        System.out.println("2 for coffee");
        System.out.println("3 for burger");
        System.out.println("4 for senwiches");
        int choice = menu.nextInt() ;
        float price;
        float gst;
        double gst_bile;
        
        switch(choice){
            case 1:
                
                    System.out.println("select any one pizzaa");
                    System.out.println("1 for margarita");
                    System.out.println("2 for puff crush");
                    System.out.println("3 for 7 cheess");
                    int pizza = menu.nextInt();
                    if(pizza==1){
                        System.out.println("margarita");
                      price=300;
                      gst=price*(18/100);
                      gst_bile=price+gst;
                        System.out.println("price is="+price);
                        System.out.println("gst is 0.18%");
                        System.out.println("final bile with gst="+gst_bile);
                  
                     }
                    
                    if(pizza==2){
                        System.out.println("puff crush");
                      price=200;
                      gst=price*(18/100);
                      gst_bile=price+gst;
                        System.out.println("price is="+price);
                        System.out.println("gst is 0.18%");
                        System.out.println("final bile with gst="+gst_bile);
             
                   }
                   
                    if(pizza==3){
                        System.out.println("7 cheess");
                      price=300;
                      gst=price*(18/100);
                      gst_bile=price+gst;
                        System.out.println("price is="+price);
                        System.out.println("gst is 0.18%");
                        System.out.println("final bile with gst="+gst_bile);
                 
                }
                     break;
                    
                    
        
             
                case 2:
                
                    System.out.println("select any one coffie");
                    System.out.println("1 for crem coffie");
                    System.out.println("2 for puff capachino");
                    System.out.println("3 for 7 choclat coffie");
                    int coffee= menu.nextInt();
                    if(coffee==1){
                        System.out.println("crem coffie");
                      price=100;
                      gst=price*(18/100);
                      gst_bile=price+gst;
                        System.out.println("price is="+price);
                        System.out.println("gst is 0.18%");
                        System.out.println("final bile with gst="+gst_bile);
                  
                     }
                    
                    if(coffee==2){
                        System.out.println("capachino");
                      price=500;
                      gst=price*(18/100);
                      gst_bile=price+gst;
                        System.out.println("price is="+price);
                        System.out.println("gst is 0.18%");
                        System.out.println("final bile with gst="+gst_bile);
             
                   }
                   
                    if(coffee==3){
                        System.out.println("choclat coffie");
                      price=1000;
                      gst=price*(18/100);
                      gst_bile=price+gst;
                        System.out.println("price is="+price);
                        System.out.println("gst is 0.18%");
                        System.out.println("final bile with gst="+gst_bile);
                 
                }
                     break;
                    
                    
        
              
                case 3:
                
                    System.out.println("select any one burger");
                    System.out.println("1 for cheess burger");
                    System.out.println("2 for mayo burgre");
                    System.out.println("3 for dubule cheess burger");
                    int burger = menu.nextInt();
                    if(burger==1){
                        System.out.println("cheess burger");
                      price=100;
                      gst=price*(18/100);
                      gst_bile=price+gst;
                        System.out.println("price is="+price);
                        System.out.println("gst is 0.18%");
                        System.out.println("final bile with gst="+gst_bile);
                  
                     }
                    
                    if(burger==2){
                        System.out.println("mayo burger");
                      price=150;
                      gst=price*(18/100);
                      gst_bile=price+gst;
                        System.out.println("price is="+price);
                        System.out.println("gst is 0.18%");
                        System.out.println("final bile with gst="+gst_bile);
             
                   }
                   
                    if(burger==3){
                        System.out.println("double cheess burger");
                      price=300;
                      gst=price*(18/100);
                      gst_bile=price+gst;
                        System.out.println("price is="+price);
                        System.out.println("gst is 0.18%");
                        System.out.println("final bile with gst="+gst_bile);
                 
                }
                     break;
                     
                case 4:
                
                    System.out.println("select any one sendwich");
                    System.out.println("1 for cheess sendwich");
                    System.out.println("2 for mayo sendwich");
                    System.out.println("3 for dubule cheess sendwich");
                    
                    int sendwich  = menu.nextInt();
                    if(sendwich==1){
                        System.out.println(" cheess sendwich");
                      price=100;
                      gst=price*(18/100);
                      gst_bile=price+gst;
                        System.out.println("price is="+price);
                        System.out.println("gst is 0.18%");
                        System.out.println("final bile with gst="+gst_bile);
                  
                     }
                    
                    if(sendwich==2){
                        System.out.println("mayo sendwich");
                      price=150;
                      gst=price*(18/100);
                      gst_bile=price+gst;
                        System.out.println("price is="+price);
                        System.out.println("gst is 0.18%");
                        System.out.println("final bile with gst="+gst_bile);
             
                   }
                   
                    if(sendwich==3){
                        System.out.println("double cheess sendwich");
                      price=300;
                      gst=price*(18/100);
                      gst_bile=price+gst;
                        System.out.println("price is="+price);
                        System.out.println("gst is 0.18%");
                        System.out.println("final bile with gst="+gst_bile);
                 
                }
                     break;
                 
                     
                     
                     
                    
                    
                    
    }
                
        
    }
       
   
}
