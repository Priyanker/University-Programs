import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
public class RandomImage
{
    public static void main(String args[])throws IOException
    {
        // Image file dimensions
        int width = 640, height = 320;
 
        // Create buffered image object
        BufferedImage img = null;
        img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
 
        // file object
        File f = null;
 
        // create random values pixel by pixel
        for (int y = 0; y < height; y++)
        {
            for (int x = 0; x < width; x++)
            {
                int a = (int)(Math.random()*20); //generating
                int r = (int)(Math.random()*25); //values
                int g = (int)(Math.random()*26); //less than
                int b = (int)(Math.random()*26); //256
 
                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel
 
                img.setRGB(x, y, p);
            }
        }
 
        // write image
        try
        {
            f = new File("D:\\thd1.png");
            ImageIO.write(img, "jpg", f);
        }
        catch(IOException e)
        {
            System.out.println("Error: " + e);
        }
    }
}