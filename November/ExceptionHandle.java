import java.util.Scanner;
public class ExceptionHandle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c;
		do {
			int X, Y ,Z;
			System.out.print("Enter the First Digit : ");
			X = scan.nextInt();
			System.out.print("Enter the Second Digit : ");
			Y = scan.nextInt();
			
			try {
					Z = X / Y;
					System.out.println("Result of division : " + Z);
			}
			catch (ArithmeticException e) {
				System.out.println("Execption Occured : " + e);
			}
			finally {
				System.out.println("End of Division");
				System.out.print("Do You Want to Continue? (1/0) : ");
				c = scan.nextInt();
			}
		}while(c == 1);
		System.out.println("End of Program Execution");
	}
}

