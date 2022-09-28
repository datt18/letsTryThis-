

//public class java_thread implements Runnable {
//    public static void main(String[] args) {
//        java_thread obj = new java_thread();
//        Thread hii = new Thread();
//        hii.start();
//        System.out.println("curently user Instagram using");
//        
//    }
//    public void run(){
//        int a=10;
//        if(a%2==0){
//            System.out.println("the number is even");
//        }
//        else{
//            System.out.println("the number is odd");
//        }
//    }
//
//    
//}
class java_thread extends Thread{
    public void run(){
        int a=10;
       if(a%2==0){
         System.out.println("the number is even");
        }
       else
       {   
           System.out.println("the number is odd");
        }
       
        
    }
    public static void main(String[] args) {
        java_thread obj = new java_thread();
        obj.start();
        System.out.println("currently insta is working....");
    }
}
