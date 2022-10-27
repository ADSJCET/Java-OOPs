import java.util.Scanner;
class theEmployee {
	Scanner scan = new Scanner(System.in);
	String name, address;
	String phone;
	int salary, age;
	void inputBasisDetails() {
		System.out.print("Enter name: ");
		name = scan.nextLine();
		System.out.print("Enter age: ");
		age = scan.nextInt();
		System.out.print("Enter Ph no: ");
		phone = scan.next();
		System.out.print("Enter address: ");
		address = scan.next();
		System.out.print("Enter salary: ");
		salary = scan.nextInt();
	}
	void displayDetails() {
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("Phone Number: "+ phone);
		System.out.println("Address: "+ address);
		System.out.println("Salary: " + salary);
	}
}
class officer extends theEmployee{
	String specialization;
	void inputBasisDetails() {
		System.out.print("Enter Officer details: \n\n");
		super.inputBasisDetails();
		System.out.print("Enter Specialization: ");
		specialization = scan.next();
		System.out.print("\n\n");
	}
	void displayDetails() {
		System.out.print("Officer Details: \n\n");
		super.displayDetails();
		System.out.println("Specialization: "+ specialization + "\n");	
	}
}
class manager extends theEmployee{
	String dept;
	void inputBasisDetails() {
		System.out.print("Enter Manager details: \n\n");
		super.inputBasisDetails();
		System.out.print("Enter Department: ");
		dept = scan.next();
		System.out.print("\n\n");
	}
	void displayDetails() {
		System.out.println("Manager Details: \n");
		super.displayDetails();
		System.out.println("Department: "+ dept + "\n");		
	}
}
public class officer_manager {
	public static void main(String[] args) {
		officer OFF = new officer();
		manager MAN = new manager();
		OFF.inputBasisDetails();
		MAN.inputBasisDetails();
		OFF.displayDetails();
		MAN.displayDetails();
	}

}