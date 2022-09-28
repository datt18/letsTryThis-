/* 
NAME OF STUDENT-PATEL DATT M.
ENROLLMENT NO-200203102067
CLASS-4IT2
SUBJECT-OOPU
CET-2
*/

/*Aim :-  Create an abstract class employee, having its properties & abstract function for
calculating  net salary and displaying the information.  Drive manager & clerk class from
 this abstract class & implement the abstract method net salary and override the display method.
*/
abstract class Employee{
    int Emp_no,grossSalary;
    String Emp_name,add;
    void accept(){}
    
    abstract void calculate();
    abstract void display();
}

class Drive_manager extends Employee{
    Drive_manager(){
        grossSalary=0;
        Emp_no = 0;
        Emp_name = "";
        add = "";
    }
    void accept(int no,String name,String ad){
        Emp_no = no;
        Emp_name = name;
        add = ad;
    }
    void display(){
        System.out.println("Employee id: "+Emp_no);
        System.out.println("Employee name: "+Emp_name);
        System.out.println("Employee address: "+add);
    }
    
    public void calculate() //calculating all the parameters 
{ 
    double grossSalary=10000;
    double incomeTax=1000; 
    double	 providentFund=800;
    double professionalTax=500;

    double netSalary=grossSalary-(incomeTax+providentFund+professionalTax);

	System.out.println("Net Salary is="+netSalary);

    
} 
}

class Clerk extends Employee{
    Clerk(){
        grossSalary=0;
        Emp_no = 0;
        Emp_name = "";
        add = "";
    }
    void accept(int no,String name,String ad){
        Emp_no = no;
        Emp_name = name;
        add = ad;
    }
    void display(){
        System.out.println("Employee id: "+Emp_no);
        System.out.println("Employee name: "+Emp_name);
        System.out.println("Employee address: "+add);
    }
    
    public void calculate() //calculating all the parameters 
{ 
    double grossSalary=10000;
    double incomeTax=1000; 
    double	 providentFund=800;
    double professionalTax=500;

    double netSalary=grossSalary-(incomeTax+providentFund+professionalTax);

	System.out.println("Net Salary is = "+netSalary);

    
} 
}

public class Main
{
	public static void main(String[] args) {
	    
	Drive_manager d = new Drive_manager();
	d.accept(302,"Uttam patel","Ahmdabad");
	d.display();
	d.grossSalary = 22302934;

	d.calculate();
	
	}
}
