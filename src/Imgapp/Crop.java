/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Imgapp;

/**
 *
 * @author nitesh
 */
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.WritableRaster; 
import java.awt.image.Raster;
 
public class Crop
 {
 
   
 
        public static BufferedImage cpImage(BufferedImage image , int x, int y, int wd, int ht ) throws IOException
            {
                BufferedImage image1 = new BufferedImage(wd,ht,BufferedImage.TYPE_INT_RGB);
                    int width = image.getWidth();
                    int height = image.getHeight();
                         for (int i = x, l=0; i < ht; i++,l++) 
                            for (int j = y, m=0; j < wd; j++,m++)
                                image1.setRGB(m,l,image.getRGB(j,i));
              
                   //ImageIO.write(image1,"PNG",new File("c:/images/Crop.png"));
                   return image1;
           }
            

         
      
 

}
