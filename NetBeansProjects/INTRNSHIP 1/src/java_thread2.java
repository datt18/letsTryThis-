/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
//using implement


public class java_thread2  implements Runnable{
    public static void main(String[] args) {
        java_thread2 hii = new java_thread2();
        Thread hello = new Thread(hii);
        hello.start();
        System.out.println("using instagram");
        
        
    }
    public void run(){
        System.out.println("whatapp is running in background");
        java_thread2 obj =new java_thread2();
        obj.hy();
    }
     public void hy(){
         System.out.println("twiter is working in bg");
     }   
}
