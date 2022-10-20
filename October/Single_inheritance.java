import java.util.Scanner;
class Employee
{
	int basic_sal,da,ta,salary;
	void calcsalary()
	{
		salary=basic_sal+da+ta;
		System.out.println("Salary of employee is: "+salary);
	}
	void display()
	{
		System.out.println("Name of the class is Employee");
	}
}
class Engineer extends Employee
{
	Engineer(int s, int d, int t)
	{
		basic_sal=s;
		da=d;
		ta=t;
	}
	void calcsalary()
	{
		super.calcsalary();
		System.out.println("Salary of Engineer is: "+(2*salary));
	}
	void display()
	{
		super.display();
		System.out.println("Name of the class is Engineer");
	}
}

public class Single_inheritance
{
	public static void main(String args[])
	{
		int basic,da,ta;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter basic salary: ");
		basic = in.nextInt();
		System.out.print("Enter dearence allowance: ");
		da = in.nextInt();
		System.out.print("Enter travel allowance: ");
		ta = in.nextInt();
		Engineer ob = new Engineer(basic,da,ta);
		ob.calcsalary();
		ob.display();
	}
}
