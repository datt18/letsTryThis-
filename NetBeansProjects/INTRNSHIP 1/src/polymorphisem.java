import java.util.Scanner;

class employee1{
    private String name;

   void name() {
     
    System.out.println("name"+name);
  }
}

class employee2 extends employee1 {
   void salary() {
    System.out.println("salary");
  }
}

class empolyee3 extends employee1 {
  void age() {
    System.out.println("age");
  }


class polymorphisem{
  public static void main(String[] args) {
      Scanner hii = new Scanner(System.in);
      String name = hii.nextLine();
      int salary = hii.nextInt();
      int age = hii.nextInt();
      
    employee1 a = new employee1();
    employee1 b = new employee2();
    employee1 c = new empolyee3();
     a.name();
    b.name();
    c.name();
  }
}

}
