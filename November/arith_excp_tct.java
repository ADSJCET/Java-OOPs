import java.util.Scanner;
public class arith_excp_tct
{
	
	public static void main(String[] args){
		int a,b,c;
		char ch;
		Scanner scn = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter two numbers\n");
			a=scn.nextInt();
			b=scn.nextInt();
			try {
				if (b==0) {
					throw new ArithmeticException("Division by Zero encountered");
				}
				c=a/b;
				System.out.println(a+"/"+b+"="+c);
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			System.out.println("Do you want to continue? (Y/N)");
			ch=scn.next().charAt(0);
			if (ch=='n'||ch=='N') {
				System.out.println("Exiting from program\n");
				break;
			}
		}
	}
}