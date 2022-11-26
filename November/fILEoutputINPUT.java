import java.io.*;
public class fILEoutputINPUT {
	public static void main(String[] args)throws IOException {
		
		File myFile = new File("example1.txt");
		if (myFile.exists())
			System.out.println("File Already Exist!");
		else {
			myFile.createNewFile();
			System.out.println("File Created");
		}
		
		
		try {
			FileOutputStream FILEOUT = new FileOutputStream(myFile);
			BufferedReader BFRD = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Enter DATA: ");
			String RAWDATA = BFRD.readLine();
			
			byte DATA[] = RAWDATA.getBytes();
			FILEOUT.write(DATA);
			System.out.println("Data added");
			FILEOUT.close();
		} 
		catch(Exception E) {
			System.out.println("Unexpected Exception: " + E);
		}
		
		FileInputStream FILEIN = new FileInputStream(myFile);
		System.out.println("Data inside the File: " + FILEIN.available() + "\n");
		
		for (int ByteDATA; (ByteDATA = FILEIN.read()) != -1; ) {
			char CharDATA = (char) ByteDATA;
			System.out.print(CharDATA);
		}
		FILEIN.close();
	}

}
