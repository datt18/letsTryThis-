//useing extend.....

public class java_threads extends Thread {
  public static int amount = 2;

  public static void main(String[] args) {
    java_threads thread = new java_threads();
    
    thread.start();
    
    while(thread.isAlive()) 
    {
      System.out.println("Waiting...");
    }
    
    System.out.println("Main: " + amount);
    amount++;
    System.out.println("Main: " + amount);
  }
  public void run() {
    amount++;
  }
}
