
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class AcceptingImage{
	public static void main(String args[]) throws IOException{
		File file = new File("/Users/sankipalli/Downloads/IMG_8534.JPG");
		
		BufferedImage bufferedImage = null;
		
		try{
		bufferedImage = ImageIO.read(file);
		ImageIO.write(bufferedImage, "jpg", new File("/Users/sankipalli/Downloads/IMG_8534.JPG"));
		
		}
		catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("Done");
		
		
		
	
	
	}
}