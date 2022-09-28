/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvclouds_day9;

import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author admin
 */
public class day9_task7 {
    public static void main(String[] args) {
        Random r = new Random();
    
        int user=0;
        int cpu=0;
        System.out.println("how much rounds ?");
        Scanner sc = new Scanner(System.in);
        int rounds = sc.nextInt();
        
        for(int i=0;i<rounds ; i++){
            int userchoice = r.nextInt(6) ;
              int cpuchoice = r.nextInt(6);
              
              if(cpuchoice > userchoice){
                  cpu +=1;
                  
              }
              else if(cpuchoice < userchoice){
                  user +=1;
              }
            
        }
        System.out.println("user score : " +user);
        System.out.println("cpu score :"  +cpu);
         
        if(cpu > user){
                  System.out.println("cpu is won !!!!");
                  
              }
              else if(cpu < user){
                  System.out.println("user  is won !!!!");
              }
    
        }
    
}
