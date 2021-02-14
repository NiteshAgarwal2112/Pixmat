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
 
public class Scale
 {
 
   
 
        public static  BufferedImage rImage(BufferedImage image, int p) throws IOException
            {
             int width = image.getWidth();
             int height = image.getHeight();
             int ht=(height*p)/100;
             int w=(width*p)/100;
             BufferedImage image1 = new BufferedImage(w,ht,BufferedImage.TYPE_INT_RGB);
                for (int ty = 0; ty < ht; ty++) {
                  for (int tx = 0; tx < w; tx++) {
                    int sx = tx * width / w;
                    int sy = ty * height / ht;
                    int color = image.getRGB(sx, sy);
                    image1.setRGB(tx, ty,color);} }
              
                  // ImageIO.write(image1,"PNG",new File("c:/images/resize.png"));
                   return image1;
          }
            

         
      
 

}
