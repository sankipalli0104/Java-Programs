import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.Random;

public class ReadFile{

	public static void main(String[] args) throws IOException{
// 		String path = "/Users/sankipalli/Documents/Java_Programs/samplefilename.txt";
// 		FileReader fileReader = new FileReader(path);
// 		BufferedReader textReader = new BufferedReader(fileReader);
// 		int numberOfLines = 3;
// 		String[ ] textData = new String[numberOfLines];
// 		for (int i=0; i < numberOfLines; i++) {
// 			textData[ i ] = textReader.readLine();
// 		}
// 		textReader.close( );
// 		return textData;
//    	String fileContent = "Hello Learner !! Welcome to howtodoinjava.com.";
    	FileWriter fileWriter = new FileWriter("/Users/sankipalli/Documents/Java_Programs/samplefilename.txt");
    	//fileWriter.write(fileContent);
    	
    	fileWriter.write(String.format("  %5s %16s \n", "Value ", " Count"));
    	System.out.printf(" %5s %16s \n", "Value ", " Count");
  		fileWriter.write(String.format("  -----------------------\n"));
    	for (int i = 20; i >= 1; i--){
    		int rand = (int)(Math.random() * 20);
    		fileWriter.write(String.format("%5d %20d \n", i, rand));
    	}
    	
    	fileWriter.close();
    }
}