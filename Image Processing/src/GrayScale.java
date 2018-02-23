// Java program to demonstrate colored to greyscale conversion
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
 
public class GrayScale
{
    public static void main(String args[])throws IOException
    {
    	BufferedImage img = null;
        File f = null;
 
        // read image
        try
        {
            f = new File("C:\\Users\\Priyanker\\Pictures\\thd.png");
            img = ImageIO.read(f);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
 
        // get image's width and height
        int width = img.getWidth();
        int height = img.getHeight();
 
        // convert to greyscale
        for (int y = 0; y < height/2; y++)
        {
            for (int x = 0; x < width; x++)
            {
                // Here (x,y)denotes the coordinate of image 
                // for modifying the pixel value.
                int p = img.getRGB(x,y);
                int a = (p>>24)&0xff;
                int r = (p>>16)&0xff;
                int g = (p>>8)&0xf0;
                int b = p&0x00;
 
                // calculate average
                int avg = (r+g+b)/3;
 
                // replace RGB value with avg
                p = (a<<24) | (avg<<16) | (avg<<8) | avg;
 
                img.setRGB(x, y, p);
            }
        }

        for (int y = height/2; y < height; y++)
        {
            for (int x =0; x < width; x++)
            {
                // Here (x,y)denotes the coordinate of image 
                // for modifying the pixel value.
                int p = img.getRGB(x,y);
                
                
                int a = (p>>24)&0xff;
                int r = (p>>16)&0x00;
                int g = (p>>8)&0xff;
                int b = p&0x00;
 
                // calculate average
                int avg = (r+g+b)/3;
 
                // replace RGB value with avg
                p = (a<<24) | (r<<16) | (g<<8) | b;
 
                img.setRGB(x, y, p);
            }
        }
 
        // write image
        try
        {
            f = new File("D:\\thd.png");
            ImageIO.write(img, "png", f);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}