import java.util.Scanner;
public class tryCatch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan = new Scanner(System.in);
		int c;
		int X, Y ,Z;
		do {
			System.out.print("Enter the First Digit : ");
			X = scan.nextInt();
			System.out.print("Enter the Second Digit : ");
			Y = scan.nextInt();
			
			try {
				if ( Y == 0 )
					throw new ArithmeticException("Division by 0");
				
					Z = X / Y;
					System.out.println("Result of division : " + Z);
			}
			catch (ArithmeticException e) {
				System.out.println("Execption Occured : " + e);
			}
			System.out.print("Do You Want to Continue? (1/0) : ");
			c = scan.nextInt();
		}while (c == 1);
		System.out.println("End of Program Execution");
	}
}
