import java.util.Scanner;
import java.io.*;

public class FileHandling {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		File myFileName = new File("anyExample.txt");
		
		if (myFileName.exists())
			System.out.println("File already exists!");
		else { 
				myFileName.createNewFile();
				System.out.println("File Created!");
			}
		
		FileOutputStream MyFileOutput = new FileOutputStream(myFileName); 
		System.out.print("Enter the Limit of Text : ");
		int n = scan.nextInt();
		System.out.print("\n");
		for(int i=0; i<n; i++) {
			System.out.print("Enter an Elements : ");
			int value = scan.nextInt();
			MyFileOutput.write(value);
		}
		MyFileOutput.close();
		
		
		FileInputStream MyFileINput = new FileInputStream(myFileName);   
		System.out.print("Element inside the file : ");
		int value;
		while ((value = MyFileINput.read()) != -1) {
			System.out.print("\t" + value);
		}
		MyFileINput.close();
		
		System.out.println("\nEnd of Program Execution");
	}
}
