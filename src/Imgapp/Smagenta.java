
package Imgapp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.WritableRaster; 
import java.awt.image.Raster;
import java.awt.Color;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImageOp;
import java.awt.image.ColorConvertOp;
import javax.imageio.ImageIO;
public class Smagenta
 {
 
    
 
        public static BufferedImage smImage(BufferedImage image) throws IOException
            {
             
                  
            
              int alpha, red, green, blue;
    int newPixel;
 
    int[] pixel = new int[3];
 
    BufferedImage rb = new BufferedImage(image.getWidth(),     image.getHeight(), image.getType());
 
    for(int i=0; i<image.getWidth(); i++) {
        for(int j=0; j<image.getHeight(); j++) {
 
            // Get pixels by R, G, B
            alpha = new Color(image.getRGB(i, j)).getAlpha();
            red = new Color(image.getRGB(i, j)).getRed();
            green = new Color(image.getRGB(i, j)).getGreen();
            blue = new Color(image.getRGB(i, j)).getBlue();
 
            pixel[0] = red;
            pixel[1] = green;
            pixel[2] = blue;
 
            int newval = pixel[0];
 
            // Return back to image format
            newPixel = colorToRGB(alpha, red, 0, blue);
 
            // Write pixels into image
            rb.setRGB(i, j, newPixel);
 
        }

    }
 

    
             
              
  // ImageIO.write(rb,"PNG",new File("c:/images/smagenta.png"));
   return rb;
  }
 private static int colorToRGB(int alpha, int red, int green, int blue) {
 
        int newPixel = 0;
        newPixel += alpha;
        newPixel = newPixel << 8;
        newPixel += red; newPixel = newPixel << 8;
        newPixel += green; newPixel = newPixel << 8;
        newPixel += blue;
 
        return newPixel;
 
    }
  
            

}