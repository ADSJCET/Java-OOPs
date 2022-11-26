import java.io.*;
public class FileToFileCopy  {
	public static void main(String[] args)throws IOException {
		BufferedReader BFRD = new BufferedReader(new InputStreamReader(System.in));
		File newFILE;
		File myFile = new File("myinitialFILE.txt");
		if (myFile.exists())
			System.out.println("File Already Exist!");
		else {
			myFile.createNewFile();
			System.out.println("File Created");
		}
		try {
			FileWriter initFILE = new FileWriter (myFile);
			
			
			System.out.print("Enter DATA: ");
			String rawDATA = BFRD.readLine();
			
			initFILE.write(rawDATA);
			System.out.println("Data added");
			initFILE.flush();
			initFILE.close();
		}
		catch(Exception E) {
			System.out.println("Unexpected Exception: " + E);
		}
		try {
			System.out.print("\nEnter the New File Name ");
			String newFILEname = BFRD.readLine();
			newFILE = new File(newFILEname);
			
			if (newFILE.exists())
				System.out.println("File Already Exist!");
			else {
				newFILE.createNewFile();
				System.out.println("File Created");
			}
			
			FileWriter FILEOut = new FileWriter (newFILE);
			FileReader FILEIn = new FileReader(myFile);
			int rawDATA;
			while ((rawDATA=FILEIn.read()) != -1) {
				System.out.print((char)rawDATA);
				FILEOut.write(rawDATA);
			}
			
			System.out.println(" => added to new file " + newFILEname );
			FILEOut.flush();
			FILEOut.close();
			FILEIn.close();
			
			System.out.print("\nText from New File :");
			FileReader finalDATA = new FileReader(newFILE);
			while ((rawDATA=finalDATA.read()) != -1) {
				System.out.print((char)rawDATA);
			}
			finalDATA.close();
			
		}
		catch(Exception E) {
			System.out.println("\nUnexpected Exception: " + E);
		}
		finally {
			System.out.println("\nEnd of Program");
		}

	}
}
