//zerocool.is-a-geek.net/?p=329
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
public class Gi
 {
 
    
 
        public static BufferedImage giImage(BufferedImage image) throws IOException
            {
                
                  
            
              int alpha, red, green, blue;
              int newPixel;
 
    BufferedImage avg_gray = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());
    int[] avgLUT = new int[766];
    for(int i=0; i<avgLUT.length; i++) avgLUT[i] = (int) (i / 3);
 
    for(int i=0; i<image.getWidth(); i++) {
        for(int j=0; j<image.getHeight(); j++) {
 
            // Get pixels by R, G, B
            alpha = new Color(image.getRGB(i, j)).getAlpha();
            red = new Color(image.getRGB(i, j)).getRed();
            green = new Color(image.getRGB(i, j)).getGreen();
            blue = new Color(image.getRGB(i, j)).getBlue();
 
            newPixel =255-red + 255-green + 255-blue;
            newPixel = avgLUT[newPixel];
            // Return back to image format
            newPixel = colorToRGB(alpha,newPixel, newPixel, newPixel);
 
            // Write pixels into image
            avg_gray.setRGB(i, j,newPixel);
 
        }
    }

    
             
              
   //ImageIO.write(avg_gray,"PNG",new File("c:/images/grayscaleinverse.png"));
   return avg_gray;
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