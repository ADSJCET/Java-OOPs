import java.util.Scanner;
import java.io.*;

public class FileHandling {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		File myFileName = new File("ExampleFile.txt");
		
		
		if (myFileName.exists())
			System.out.println("File already exists!");
		else myFileName.createNewFile(); 
		
		FileOutputStream MyFileOutput = new FileOutputStream(myFileName); 
		System.out.print("Enter the Limit of Text : ");
		int n = scan.nextInt();
		for(int i=0; i<n; i++) {
			System.out.print("\nEnter the elements for position "+(i+1)+": ");
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
	}
}
