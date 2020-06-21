// import java.io.IOException;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.util.Random;
// import java.util.stream.IntStream;
// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.FileWriter;
public class GenerateRandomNumbersInFile{
	public static void main(String[] args){ //throws FileNotFoundException{
		//FileWriter fileWriter = new FileWriter("/Users/sankipalli/Documents/Java_Programs/samplefilename.txt");
    	//fileWriter.write(fileContent);
    	
    	//fileWriter.write(String.format("  %5s %16s \n", "Value ", " Count"));
    	System.out.printf(" %5s %16s \n", "Value ", " Count");
  		//fileWriter.write(String.format("  -----------------------\n"));
    	for (int i = 20; i >= 1; i--){
    		int rand = (int)(Math.random() * 20);
    		//fileWriter.write(String.format("%5d %20d \n", i, rand));
    		System.out.printf(" %5d %d \n",i ,rand );
    	}
    	
    	//fileWriter.close();
	}
}