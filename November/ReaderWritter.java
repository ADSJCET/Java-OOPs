import java.io.*;
public class ReaderWritter {
	public static void main(String[] args)throws IOException {
		
		File myFile = new File("newerFILE.txt");
		if (myFile.exists())
			System.out.println("File Already Exist!");
		else {
			myFile.createNewFile();
			System.out.println("File Created");
		}
		
		try {
			FileWriter FILEOUT = new FileWriter (myFile);
			BufferedReader BFRD = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Enter DATA: ");
			String DATA = BFRD.readLine();
			
			FILEOUT.write(DATA);
			System.out.println("Data added");
			FILEOUT.flush();
			FILEOUT.close();
		} 
		catch(Exception E) {
			System.out.println("Unexpected Exception: " + E);
		}
		
		FileReader FILEIN = new FileReader(myFile);
		int intDATA;
		while ((intDATA=FILEIN.read()) != -1)
            System.out.print((char)intDATA);
		
		FILEIN.close();
	}
}
