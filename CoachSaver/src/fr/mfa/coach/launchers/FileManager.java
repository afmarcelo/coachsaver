/**
 * 
 */
package fr.mfa.coach.launchers;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * @author marcelo
 *
 */
public class FileManager {

	public void writeToFile(String fileName, String data ) {	
		try {
			
			File file = new File(fileName);
			
			//if file doesnt exists, then create it
			if(!file.exists()){
    			file.createNewFile();
    		}
			
			//true = append file
			FileWriter fileWriter = new FileWriter(file, true);
			BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
	        bufferWriter.write(data);
	        bufferWriter.close();
			fileWriter.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
