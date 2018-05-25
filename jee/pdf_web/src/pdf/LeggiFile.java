package pdf;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeggiFile {
	
	public static String leggere(String fileName) {
		
		String fileCompleto = "";
		String line = null;

		try {
	
			FileReader fileReader = new FileReader(fileName);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				fileCompleto = fileCompleto + line;
			}

			bufferedReader.close();
			return fileCompleto;
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
			return fileCompleto;
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
			return fileCompleto;
		}
		
	}

}
