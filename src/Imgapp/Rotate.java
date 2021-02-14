/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Imgapp;

/**
 *
 * @author nitesh
 */
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.WritableRaster; 
import java.awt.image.Raster;
 
public class Rotate
 {
 
    
 
        public static BufferedImage roImage(BufferedImage image , int al) throws IOException
            {
               int width = image.getWidth();
                    int height = image.getHeight();
                    double angle = Math.toRadians(al);
                    double sin = Math.sin(angle);
                    double cos = Math.cos(angle);
                    double x0 = 0.5 * (width  - 1),a;     // point to rotate about
                    double y0 = 0.5 * (height - 1),b;
                    int minx=width;
                    int miny=height;
                    //BufferedImage image1 = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
                     for ( int y = 0; y < height; y++)
                {
                   for ( int x = 0; x < width;x++)
                  {
                    a= x - x0;
                    b =y - y0;
                    int xx = (int) (+a * cos - b * sin + x0);
                    int yy = (int) (+a * sin + b * cos + y0);
                    if(minx>xx)
                    {
                        minx=xx;
                    }
                     if(miny>yy)
                    {
                        miny=yy;
                    }
                  }}
                     BufferedImage image1 = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
                      AffineTransform tx = new AffineTransform();
    tx.rotate(0.5, width/2, height / 2);

    AffineTransformOp op = new AffineTransformOp(tx,
        AffineTransformOp.TYPE_BILINEAR);
    image1 = op.filter(image1, null);

                /*for ( int y = 0; y < height; y++)
                {
                   for ( int x = 0; x < width;x++)
                  {
                    b= x - x0;
                    a =y - y0;
                    int yy = (int) (+a * cos - b * sin + y0);
                    int xx = (int) (+a * sin + b * cos + x0);
                   if (xx>= 0 && xx< width && yy>= 0 && yy < height)
                    image1.setRGB(x, y, image.getRGB(xx, yy));
                   image.rotate();
                   else
                   
                      { 
                        int newPixel = colorToRGB(0, 255,255,255);
                        image1.setRGB(x,y,newPixel);
                      }
                  }
                }
                
                  
              
                   //ImageIO.write(image1,"PNG",new File("c:/images/rotate1.png"));*/
                   return image1;
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
