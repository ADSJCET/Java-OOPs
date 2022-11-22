import java.util.Scanner;
class employee {
	Scanner scan = new Scanner(System.in);
	int Basic, TA, DA, Total;
	String className = "Employee"; 
	void display() {
		System.out.println("Name of the class is " + className );
	}
	
	void calcSalary () {
		Total = Basic + TA + DA ;
		System.out.println("Employee salary is "+ Total);
	}
	void inputSalary () {
		System.out.print("Enter the Basic salary: ");
		Basic = scan.nextInt();
		
		System.out.print("Enter the TA: ");
		TA = scan.nextInt();
		
		System.out.print("Enter the DA: ");
		DA = scan.nextInt();
	}
}
class engineer extends employee{
	String className = "Engineer";
	void calcSalary () {
		super.calcSalary ();
		Total = Total * 2;
		System.out.println("Engineer salary is "+ Total);
	}
	void display() {
		super.display();
		System.out.println("Name of the class is " + className );
	}
}

public class employee_engineer {
	public static void main(String[] args) {
		engineer newIntern = new engineer();
		newIntern.inputSalary();
		newIntern.calcSalary();
		newIntern.display();
	}
}
