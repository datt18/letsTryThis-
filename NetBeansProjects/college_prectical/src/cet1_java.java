/*
enrollment no-200203102067
name-patel datt mukeshbhai
class-4it2
cet1
*/


//cet1 of java
/*NIL = 0-2.5 Lakhs
	5% = 2.5 - 5 lakhs
	10% = 5 - 7.5 lakhs
	15% = 7.5 - 10 lakhs
	20% = 10 - 12.50 lakhs
	25% = 12.50 - 15 lakhs
	30%	= >15 lakhs
*/
import java.util.Scanner;
public class cet1_java
{
	public static void main(String args[])
	{
		int sal; 
		double tax;
		System.out.println("Enter Your Salary ");
		Scanner r=new Scanner(System.in);
		sal=r.nextInt();
		
		if(sal<250000)
		{
			System.out.println("Applicable Tax is " + "0% or NILL");
		}
		else if(sal>250000 && sal<=500000)
		{
			tax=sal*0.05;
			System.out.println("Applicable tax " + tax);
		}
		else if(sal>500000 && sal<=750000)
		{
			tax=sal*0.10;
			System.out.println("Applicable tax " + tax);
		}
		else if(sal>750000 && sal<=100000)
		{
			tax=sal*0.15;
			System.out.println("Applicable tax " + tax);
		}
		else if(sal>100000 && sal<=1250000)
		{
			tax=sal*0.20;
			System.out.println("Applicable tax " + tax);
		}
		else if(sal>1250000 && sal<=1500000)
		{
			tax=sal*0.25;
			System.out.println("Applicable tax " + tax);
		}
		else
		{
			tax=sal*0.30;
			System.out.println("Applicable tax " + tax);
		}
	}
}

    