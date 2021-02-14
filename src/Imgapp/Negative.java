package Imgapp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.WritableRaster; 
import java.awt.image.Raster;
import java.awt.Color;
 
public class Negative
 {
 
    
 
        public static BufferedImage ngImage(BufferedImage image) throws IOException
            {
                
                  
            int a, b, c, d, i, j, color;
             int w = image.getWidth();
             int h = image.getHeight();
             int pixel[]= new int[w*h];
                
                int l=0;
                int pix[]= new int[w*h];
         

        
BufferedImage outputImage = new BufferedImage( w, h, BufferedImage.TYPE_INT_RGB );


// Four pixels a,b,c,d 

float alpha, beta, xabRed, xabGreen, xabBlue, xcdRed, xcdGreen, xcdBlue, xfinalRed, xfinalGreen, xfinalBlue;
for ( i = 0; i < w-1; i++)
for( j = 0; j < h-1; j++){

//Find the color values of the 4 pixels around the desired point to interpolate
            alpha = new Color(image.getRGB(i, j)).getAlpha();
           int red = new Color(image.getRGB(i, j)).getRed();
           int green = new Color(image.getRGB(i, j)).getGreen();
           int blue = new Color(image.getRGB(i, j)).getBlue();
color = new Color(255-(int)red, 255-(int)green, 255-(int)blue).getRGB();

// Set the pixel
outputImage.setRGB(i, j, color);
}
    
             
              
   //ImageIO.write(outputImage,"PNG",new File("c:/images/Negative.png"));
   return outputImage;
           }
  
           


}