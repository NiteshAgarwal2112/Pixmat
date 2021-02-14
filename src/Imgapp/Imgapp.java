/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Imgapp;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/*<applet code="course.class" width="500" height="250">
	</applet>
*/
 
//@SuppressWarnings("serial")

public class Imgapp extends JFrame implements ActionListener
{        int x,y,w,h,error,p,a;
        // double a;
          
          String str="",ext;
         String filename="";
          //BufferedImage img = null;
        BufferedImage tmp;
        BufferedImage image = null,oimage=null;
	public static Button exitButton,closeButton,openButton, cropButton, resizeButton,rotateButton,gsButton,ng1Button,giButton,srButton,sgButton,sbButton,smButton,sButton,scButton,syButton,saveButton,originalButton;
	static TextField xField,yField,wField,hField,pField,aField;
       // static JLabel x,y;
          Crop cp = new Crop(); 
          Scale rs=new Scale();
          Rotate ro=new Rotate();
          Bw bw=new Bw();
          Gi gi=new Gi();
          Negative ng=new Negative();
          Sr sr=new Sr();
           Sg sg=new Sg();
            Sb sb=new Sb();
             Scyan sc=new Scyan();
              Sy sy=new Sy();
               Smagenta sm=new Smagenta();
               Sepia s=new Sepia();
             
           
          
          
	//Imgapp img = new Imgapp();
	static Container con;
        public static Button ngButton;
	//int insertFlag, searchFlag, deleteFlag, searchSuccess, error, exist;
	//boolean delSearchFlag;
	
	
	//@Override
	public void init() 
	{
		//super.init();
		con = getContentPane();
		con.setLayout(null);
		
		//x = new JLabel();
               // x.setText("starting Coordinate");
		openButton = new Button("Open");
                closeButton = new Button("Close");
                exitButton = new Button("Exit");
		cropButton = new Button("Crop");
		resizeButton = new Button("Resize");
                rotateButton = new Button("Rotate");
                originalButton = new Button("original");
                gsButton  = new Button("Gray Scale");
                ngButton  =  new Button("Negative");     
		giButton  =  new Button("Gray Inverse");
                srButton  =  new Button("Red");
                sgButton  =  new Button("green");
                sbButton  =  new Button("Blue");
                smButton  =  new Button("Magneta");
                sButton   =  new Button("sepia");
               scButton   =  new Button("Cyan");
               syButton   =  new Button("Yellow");
               saveButton =  new Button("Save");       
               xField = new TextField();
		yField = new TextField();
                wField = new TextField();
                hField = new TextField();
                pField = new TextField();
                aField = new TextField();
                openButton.setBounds(0, 0, 70, 30);
                openButton.setBackground(Color.yellow);
                xField.setBounds(80, 0, 50, 20);
                yField.setBounds(140, 0, 50, 20);
                wField.setBounds(210, 0, 50, 20);
                hField.setBounds(280, 0, 50, 20);
                cropButton.setBounds(360, 0, 70, 30);
                 pField.setBounds(440, 0, 50, 20);
                 resizeButton.setBounds(510, 0, 70, 30);
                  aField.setBounds(585, 0, 50, 20);
                  rotateButton.setBounds(650, 0, 70, 30);
                  originalButton.setBounds(730,0,70,30);
                  gsButton.setBounds(0, 110, 100, 20);
                ngButton.setBounds(0, 140 ,100, 20);
                giButton.setBounds(0, 170, 100, 20);
                srButton.setBounds(0, 200, 100, 20);
                sgButton.setBounds(0, 230, 100, 20);
                sbButton.setBounds(0, 260, 100, 20);
                smButton.setBounds(0, 290, 100, 20);
                scButton.setBounds(0, 320, 100, 20);
                syButton.setBounds(0, 350, 100, 20);
                sButton.setBounds(0, 380, 100, 20);
                saveButton.setBounds(0, 430, 70, 30);
                closeButton.setBounds(0, 500, 70, 30);
                exitButton.setBounds(0, 550, 70, 30);
		               
		con.add(xField);
                con.add(yField);
                con.add(wField);
                con.add(hField);
                con.add(pField);
                con.add(aField);
	        con.add(openButton);
                con.add(closeButton);
                con.add(exitButton);
		con.add(cropButton);
                con.add(resizeButton);
		con.add(rotateButton);
                con.add(originalButton);
                con.add(gsButton);
		con.add(ngButton);
                con.add(giButton);
		con.add(srButton);
                con.add(sgButton);
		con.add(sbButton);
                con.add(scButton);
		con.add(smButton);
                con.add(syButton);
		con.add(sButton);
                con.add(saveButton);
                addWindowListener(new WindowAdapter()   //ÓÃÀ´¹Ø±Õ´°¿Ú
            {
                @Override
          public void windowClosing(WindowEvent e)
          {
              System.exit(0);
          }
            });
                        
			
		openButton.addActionListener(this);
                closeButton.addActionListener(this);
                exitButton.addActionListener(this);
		cropButton.addActionListener(this);
                resizeButton.addActionListener(this);
                rotateButton.addActionListener(this);
                originalButton.addActionListener(this);
                giButton.addActionListener(this);
                ngButton.addActionListener(this);
                gsButton.addActionListener(this);
                srButton.addActionListener(this);
                sgButton.addActionListener(this);
                sbButton.addActionListener(this);
                smButton.addActionListener(this);
                sButton.addActionListener(this);
                scButton.addActionListener(this);
                syButton.addActionListener(this);
                saveButton.addActionListener(this);
		setVisible(true);
		repaint();
	}

    
    @Override
    public void paint(Graphics g)
	 {       //g.drawString(filename, 500, 500);
                     g.setColor(Color.white);
                     g.fillRect(0, 0, 1385, 768);
		    // g.fillRect(105, 60, 1273, 740);
                       
                       //repaint();
                // BufferedImage image;
                 //image = img;
                 //tmp=image;
                 g.setColor(Color.black);
                 g.drawLine(85, 0, 100, 100);
                 g.drawString("starting index", 105, 85);
                 g.drawString("X", 105, 65);
                 g.drawString("Y", 165, 65);
                 g.drawString("Size", 250, 85);
                 g.drawString("Width", 220, 65);
                  g.drawString("Height", 290, 65);
                  g.drawLine(445, 0, 445, 100);
                   g.drawString("Percent", 450, 65);
                   g.drawLine(590, 0, 590, 100); 
                 g.drawString("Angle", 600, 65);
                 g.drawLine(730, 0, 730, 100);
                 g.drawLine(820, 0, 820, 100);
                 g.drawString("Color Effects", 10, 120);
                  g.drawLine(0, 570, 110, 570);
                  g.drawLine(0, 620, 110, 620);
                 
                 g.drawLine(0, 415, 105, 415);
                 if(image==null)
                 {
                 g.drawString("Preview", 689, 400);
                 }
                
                // g.drawLine(435, 0, 435, 60);
                 
                      
                 g.drawLine(110, 100, 110, 800);
                 g.drawLine(0, 500, 110, 500);
                 g.drawLine(0, 450, 110, 450);
                 g.drawLine(0, 100, 1378, 100);
                 g.drawImage(image, 110, 101, this);
               //  image=null;
                 //
		 //g.setColor(Color.red);
		 //g.fillRect(100, 100, 1250, 800);
		// g.fillRect(550, 20, 500, 100);
}
    @Override
    public void actionPerformed(ActionEvent e) 
	{
			Object source = e.getSource();
			try
			{
				if(source == openButton)
				{
					
                                     if(image==null)
                                     {   
                                   JFileChooser jfc=new JFileChooser();
                                   jfc.setDialogTitle("Open");
       
                                     jfc.setFileFilter(new javax.swing.filechooser.FileFilter() {
                                       @Override
                          public boolean accept(File f)
                                       {
                              return (f.getName().toLowerCase().endsWith(".jpg")
                      || f.getName().toLowerCase().endsWith(".png")||f.getName().toLowerCase().endsWith(".bmp")||f.getName().toLowerCase().endsWith(".tif")||f.getName().toLowerCase().endsWith(".gif")||f.getName().toLowerCase().endsWith(".raw")||f.isDirectory());
                                        }
                     @Override
                         public String getDescription() {
                                  return "jpg,png,gif,tif,raw,bmp Images";
                                    }
                                 });
                          int opt=jfc.showOpenDialog(null);
                          if(opt==JFileChooser.APPROVE_OPTION)
                                 {
                                filename=jfc.getSelectedFile().getAbsolutePath();
                                 //setTitle("Photofill");
                                str="";
                              
        }
                      
                       // ext = filename.substring(filename.lastIndexOf('.')); 
                       
                       image = readImage(filename);
                       oimage = image;
                       tmp=image;
                       if(image==null)
                       {
                           JOptionPane.showMessageDialog(null," Please select an Image ... "); 
                       }
                      	repaint();
                        ext = filename.substring(filename.lastIndexOf('.'));
                               // System.out.println(ext);
                         
                         }
                         else {
                                
                             JOptionPane.showMessageDialog(null," Please save or close existing Image ... ");
                         }
        
        
	}
           
				else if(source == cropButton)
				{  
                                    
                                    
                                    if(image==null)
                                    {
					
                                       JOptionPane.showMessageDialog(null," Please select an Image ... "); 
                                  
					repaint();
				    }
                                    else
                                    {
                                    
                                     try
                                     {
                                                                                                                                                        
                                      x =  Integer.parseInt(xField.getText());
                                      y =  Integer.parseInt(yField.getText());
                                      w =  Integer.parseInt(wField.getText());
                                      h =  Integer.parseInt(hField.getText());
                                     if(x>image.getWidth()||y>image.getHeight()||w>image.getWidth()||h>image.getHeight())
                                         {
                                             JOptionPane.showMessageDialog(null,"value out of range of Image");
                                         }
                                     
                                     else if(x<0||y<0||w<0||h<0)
                                     {
                                       JOptionPane.showMessageDialog(null,"value should not be negative");  
                                     }
                                     else if((x+w)>image.getWidth())
                                     {
                                       JOptionPane.showMessageDialog(null,"x+width not be greater then image width");  
                                     }
                                     else if((y+h)>image.getHeight())
                                     {
                                       JOptionPane.showMessageDialog(null,"y+height not be greater then image height");  
                                     }
                                    else
                                       {
                                   image= Crop.cpImage(image,x,y,x+w,y+h);
                                   repaint();
                                   tmp = image;
                                   //image=null;
                                       }
                                       }
                                     catch(Exception e4)
                                     {
                                        error=1;
                                        
                                     }
                                     if(error == 1)
                                     {
                                      JOptionPane.showMessageDialog(null,"Plese fill the all fields with intger values");
                                      error=0;
                                     }
                                     
                                    // error=0;
                                    
                                    }
                             } 
                                else if(source == resizeButton)
				{  
                                    
                                    
                                    if(image==null)
                                    {
					
                                       JOptionPane.showMessageDialog(null," Please select an Image ... "); 
                                  
					repaint();
				    }
                                    else
                                    {
                                    
                                     try
                                     {
                                                                                                                                                        
                                      p =  Integer.parseInt(pField.getText());
                                     
                                     
                                     
                                     if(p<0)
                                     {
                                       JOptionPane.showMessageDialog(null,"value should not be negative");  
                                     }
                                     
                                    else
                                       {
                                   image= Scale.rImage(image,p);
                                   repaint();
                                   tmp=image;
                                   //image=null;
                                       }
                                       }
                                     catch(Exception e4)
                                     {
                                        error=1;
                                        
                                     }
                                     if(error == 1)
                                     {
                                      JOptionPane.showMessageDialog(null,"Plese fill the all fields with intger values");
                                      error=0;
                                     }
                                     
                                    // error=0;
                                    
                                    }
                             }
                                else if(source == rotateButton)
				{  
                                    
                                    
                                    if(image==null)
                                    {
					
                                       JOptionPane.showMessageDialog(null," Please select an Image ... "); 
                                  
					repaint();
				    }
                                    else
                                    {
                                    
                                     try
                                     {
                                                                                                                                                        
                                      a =  Integer.parseInt(aField.getText());
                                      
                                     
                                     if(a<0)
                                     {
                                       JOptionPane.showMessageDialog(null,"value should not be negative");  
                                     }
                                     
                                    else
                                       {
                                   image= Rotate.roImage(image,a);
                                   repaint();
                                   tmp=image;
                                   //image=null;
                                       }
                                       }
                                     catch(Exception e4)
                                     {
                                        error=1;
                                        
                                     }
                                     if(error == 1)
                                     {
                                      JOptionPane.showMessageDialog(null,"Plese fill the all fields with intger values");
                                      error=0;
                                     }
                                     
                                    // error=0;
                                    
                                    }
                             }
                                else if(source == gsButton)
				{  
                                    
                                    
                                    if(image==null)
                                    {
					
                                       JOptionPane.showMessageDialog(null," Please select an Image ... "); 
                                  
					repaint();
				    }
                                    else
                                    {
                                    
                                     try
                                     {
                                       image=tmp;                                                                                                                 
                                      
                                     image= bw.bwImage(image);
                                   repaint();
                                   //image=null;
                                       
                                       }
                                     catch(Exception e4)
                                     {
                                        //error=1;
                                        
                                     }
                                     if(error == 1)
                                     {
                                      JOptionPane.showMessageDialog(null,"Color Not be change");
                                      error=0;
                                     }
                                     
                                    // error=0;
                                    
                                    }
                             }
                                else if(source == ngButton)
				{  
                                    
                                    
                                    if(image==null)
                                    {
					
                                       JOptionPane.showMessageDialog(null," Please select an Image ... "); 
                                  
					repaint();
				    }
                                    else
                                    {
                                    
                                     try
                                     {
                                                                                                                                                        
                                      image=tmp;
                                     image= ng.ngImage(image);
                                   repaint();
                                   //image=null;
                                       
                                       }
                                     catch(Exception e4)
                                     {
                                        //error=1;
                                        
                                     }
                                     if(error == 1)
                                     {
                                      JOptionPane.showMessageDialog(null,"Color Not be change");
                                      error=0;
                                     }
                                     
                                    // error=0;
                                    
                                    }
                             }
                                else if(source == giButton)
				{  
                                    
                                    
                                    if(image==null)
                                    {
					
                                       JOptionPane.showMessageDialog(null," Please select an Image ... "); 
                                  
					repaint();
				    }
                                    else
                                    {
                                    
                                     try
                                     {
                                                                                                                                                        
                                      image=tmp;
                                     image= gi.giImage(image);
                                   repaint();
                                   //image=null;
                                       
                                       }
                                     catch(Exception e4)
                                     {
                                        //error=1;
                                        
                                     }
                                     if(error == 1)
                                     {
                                      JOptionPane.showMessageDialog(null,"Color Not be change");
                                      error=0;
                                     }
                                     
                                    // error=0;
                                    
                                    }
                             }
                                else if(source == srButton)
				{  
                                    
                                    
                                    if(image==null)
                                    {
					
                                       JOptionPane.showMessageDialog(null," Please select an Image ... "); 
                                  
					repaint();
				    }
                                    else
                                    {
                                    
                                     try
                                     {
                                                                                                                                                        
                                       image=tmp;
                                     image= sr.srImage(image);
                                   repaint();
                                   //image=null;
                                       
                                       }
                                     catch(Exception e4)
                                     {
                                        //error=1;
                                        
                                     }
                                     if(error == 1)
                                     {
                                      JOptionPane.showMessageDialog(null,"Color Not be change");
                                      error=0;
                                     }
                                     
                                    // error=0;
                                    
                                    }
                             }
                                else if(source == sgButton)
				{  
                                    
                                    
                                    if(image==null)
                                    {
					
                                       JOptionPane.showMessageDialog(null," Please select an Image ... "); 
                                  
					repaint();
				    }
                                    else
                                    {
                                    
                                     try
                                     {
                                        image=tmp;                                                                                                                 
                                      
                                     image= sg.sgImage(image);
                                   repaint();
                                   //image=null;
                                       
                                       }
                                     catch(Exception e4)
                                     {
                                        //error=1;
                                        
                                     }
                                     if(error == 1)
                                     {
                                      JOptionPane.showMessageDialog(null,"Color Not be change");
                                      error=0;
                                     }
                                     
                                    // error=0;
                                    
                                    }
                             }
                                else if(source == sbButton)
				{  
                                    
                                    
                                    if(image==null)
                                    {
					
                                       JOptionPane.showMessageDialog(null," Please select an Image ... "); 
                                  
					repaint();
				    }
                                    else
                                    {
                                    
                                     try
                                     {
                                       image=tmp;                                                                                                                  
                                      
                                     image= sb.sbImage(image);
                                   repaint();
                                   //image=null;
                                       
                                       }
                                     catch(Exception e4)
                                     {
                                        //error=1;
                                        
                                     }
                                     if(error == 1)
                                     {
                                      JOptionPane.showMessageDialog(null,"Color Not be change");
                                      error=0;
                                     }
                                     
                                    // error=0;
                                    
                                    }
                             }
                                else if(source == sButton)
				{  
                                    
                                    
                                    if(image==null)
                                    {
					
                                       JOptionPane.showMessageDialog(null," Please select an Image ... "); 
                                  
					repaint();
				    }
                                    else
                                    {
                                    
                                     try
                                     {
                                                                                                                                                        
                                       image=tmp;
                                     image= s.sImage(image);
                                   repaint();
                                   //image=null;
                                       
                                       }
                                     catch(Exception e4)
                                     {
                                        //error=1;
                                        
                                     }
                                     if(error == 1)
                                     {
                                      JOptionPane.showMessageDialog(null,"Color Not be change");
                                      error=0;
                                     }
                                     
                                    // error=0;
                                    
                                    }
                             }
                                else if(source == scButton)
				{  
                                    
                                    
                                    if(image==null)
                                    {
					
                                       JOptionPane.showMessageDialog(null," Please select an Image ... "); 
                                  
					repaint();
				    }
                                    else
                                    {
                                    
                                     try
                                     {
                                        image=tmp;                                                                                                                 
                                      
                                     image= sc.scImage(image);
                                   repaint();
                                   //image=null;
                                       
                                       }
                                     catch(Exception e4)
                                     {
                                        //error=1;
                                        
                                     }
                                     if(error == 1)
                                     {
                                      JOptionPane.showMessageDialog(null,"Color Not be change");
                                      error=0;
                                     }
                                     
                                    // error=0;
                                    
                                    }
                             }
                                else if(source == smButton)
				{  
                                    
                                    
                                    if(image==null)
                                    {
					
                                       JOptionPane.showMessageDialog(null," Please select an Image ... "); 
                                  
					repaint();
				    }
                                    else
                                    {
                                    
                                     try
                                     {
                                        image=tmp;                                                                                                                 
                                      
                                     image= sm.smImage(image);
                                   repaint();
                                   //image=null;
                                       
                                       }
                                     catch(Exception e4)
                                     {
                                        //error=1;
                                        
                                     }
                                     if(error == 1)
                                     {
                                      JOptionPane.showMessageDialog(null,"Color Not be change");
                                      error=0;
                                     }
                                     
                                    // error=0;
                                    
                                    }
                             }
                                else if(source == syButton)
				{  
                                    
                                    
                                    if(image==null)
                                    {
					
                                       JOptionPane.showMessageDialog(null," Please select an Image ... "); 
                                  
					repaint();
				    }
                                    else
                                    {
                                    
                                     try
                                     {
                                       image=tmp;                                                                                                                  
                                      
                                     image= Sy.syImage(image);
                                   repaint();
                                   //image=null;
                                       
                                       }
                                     catch(Exception e4)
                                     {
                                        //error=1;
                                        
                                     }
                                     if(error == 1)
                                     {
                                      JOptionPane.showMessageDialog(null,"Color Not be change");
                                      error=0;
                                     }
                                     
                                    // error=0;
                                    
                                    }
                             }
                                else if(source == saveButton)
				{  
                                    
                                    
                                    if(image==null)
                                    {
					
                                       JOptionPane.showMessageDialog(null," Please select an Image ... "); 
                                  
					repaint();
				    }
                                    else
                                    {
                                    
                                     try
                                     {
                                       String newFile = filename.substring(0, filename.lastIndexOf('\\'));                                                                                                                 
                                      
                                     ImageIO.write(image,"PNG",new File(newFile+"\\output"+ext));
                                     JOptionPane.showMessageDialog(null," Image Successfully saved... "); 
                                     repaint();
                                 //  image=null;
                                       
                                       }
                                     catch(Exception e4)
                                     {
                                        //error=1;
                                        
                                     }
                                     if(error == 1)
                                     {
                                      JOptionPane.showMessageDialog(null,"Image Not be saved");
                                      error=0;
                                     }
                                     
                                    // error=0;
                                    
                                    }
                             }
                                else if(source == closeButton)
				{  
                                    if(image==null)
                                    {
					
                                       JOptionPane.showMessageDialog(null," Please select an Image ... "); 
                                  
					repaint();
				    }
                                    else
                                    {
                                    image=null;
                                    repaint();
                                    }
                                }
                                else if(source == exitButton)
				{   //repaint();   
                                    System.exit(0);   
                                                                   
                                }
                                else if(source==originalButton)
                                {
                                    if(image==null)
                                    {
					
                                       JOptionPane.showMessageDialog(null," Please select an Image ... "); 
                                  
					repaint();
				    }
                                    else 
                                    {
                                   image=oimage;
                                   tmp=image;
                                   repaint();
                                    }
                                }
                                
                        }       
             catch(Exception e3){}
        }            
				/*else if(source == deleteButton)
				{
					searchFlag = 0;
					deleteFlag = 1;
					delSearchFlag = tree.search(Integer.parseInt(elementField.getText()));
					if(delSearchFlag)
					{
						tree.delete(Integer.parseInt(elementField.getText()));
					}
					repaint();
				}
			}
			catch (Exception ex) 
			{
				error = 1;
				repaint();
			}*/
			
	//}
       // }
     public static void main(String args[])
    {
        Imgapp a= new Imgapp();
        //a.setTitle("Photofill");
               a.setTitle("Photofill-A Photo Editor");
                a.setBounds(0,0,1366,768);
                a.setBackground(new Color(192,192,192));
      //a.setCursor(Cursor.CROSSHAIR_CURSOR);
        a.init();
        a.show();
        
    }
            public static BufferedImage readImage(String fileLocation)
             {
               BufferedImage img;
                img = null;
               try 
                {
                 img = ImageIO.read(new File(fileLocation));
              } 
                 catch (IOException e) 
              {
             }
              return img;
  
          }
}