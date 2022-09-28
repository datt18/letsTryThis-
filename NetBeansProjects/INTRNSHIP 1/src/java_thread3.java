/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
//thread priority
public class java_thread3  extends Thread{
    public void run(){
        System.out.println("runing thread"+
        Thread.currentThread().getPriority());
    }
    
    public static void main(String[] args) {
        java_thread3 m1 = new java_thread3();
        java_thread3 m2 = new java_thread3();
        java_thread3 m3 = new java_thread3();

        m1.setPriority(Thread.MIN_PRIORITY);
        
        m2.setPriority(Thread.MAX_PRIORITY);
        m3.setPriority(Thread.NORM_PRIORITY);
        m1.start();
        m2.start();
        m3.start();
    }
    
}
