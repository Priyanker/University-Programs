import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.File;
import javax.imageio.ImageIO;
public class MirrorImage {
	public static void main(String[] args) {
		BufferedImage image1 = null;
		BufferedImage image2 = null;
		File input;
		try
		{
			input = new File("C:\\Users\\Priyanker\\Pictures\\thd1.png");
			image1 = ImageIO.read(input);
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		int width = image1.getWidth();
		int height = image1.getHeight();
		image2 = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		for(int y=0;y<height;y++)
		{
			for(int x=width-1;x>=0;x--)
			{
				int p = image1.getRGB(x, y);
				image2.setRGB(width-x-1, y, p);
			}
		}
		
		try
		{
			File output = new File("D:\\thd1.png");
			ImageIO.write(image2, "png", output);
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
