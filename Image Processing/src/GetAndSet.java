// Java program to demonstrate read and write of image
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class GetAndSet
{
	public static void main(String args[])throws IOException
	{
		BufferedImage img = null;
		File f = null;
		
		//read image
		try
		{
		    f = new File("C:\\Users\\Priyanker\\Pictures\\thd.png");
		    img = ImageIO.read(f);
		}
		catch(IOException e)
		{
		    System.out.println(e);
		}
		
		//get image width and height
		int width = img.getWidth();
		int height = img.getHeight();
		//System.out.println(width + " "+height);
		/*  Since, Inp.jpg is a single pixel image so, we
		    will not be using the width and height variable */
		
		/* get pixel value (the arguments in the getRGB method
		 denotes the  cordinates of the image from which the
		 pixel values need to be extracted) */
		int p = img.getRGB(0,0);
		//System.out.println(p);
		/* We, have seen that the components of pixel occupy
		   8 bits. To get the bits we have to first right shift
		   the 32 bits of the pixels by bit position(such as 24
		   in case of alpha) and then bitwise ADD it with 0xFF.
		   0xFF is the hexadecimal representation of the decimal
		   value 255.  */
		
		// get alpha
		int a = (p>>24) & 0xff;
		System.out.println(a);
		// get red
		int r = (p>>16) & 0xff;
		System.out.println(r);
		// get green
		int g = (p>>8) & 0xff;
		System.out.println(g);
		
		// get blue
		int b = p & 0xff;
		System.out.println(b);
		
		/*
		for simplicity we will set the ARGB
		value to 255, 100, 150 and 200 respectively.
		*/
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<width;j++)
			{

				a = 255;
				r = 0;
				g = 0;
				b = 255;
				
				//set the pixel value
				p = (a<<24) | (r<<16) | (g<<8) | b;
				img.setRGB(j, i, p);
				//System.out.println(p);
			}
		}
		//write image
		try
		{
		    f = new File("D:\\thd.png");
		    ImageIO.write(img, "png", f);
		}
		catch(IOException e)
		{
		    System.out.println(e);
		}
	}//main() ends here
}//class ends here
