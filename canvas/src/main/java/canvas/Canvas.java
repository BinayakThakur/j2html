package canvas;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import structure.Brush;  
public class Canvas extends WireFrame{
    
    public void paint() throws IOException{
    	Desktop desk=Desktop.getDesktop();
        try{
        	init();
            FileOutputStream fos=new FileOutputStream(location);
            fos.write(file.getBytes());
            fos.close();
            File generated=new File(saveAt);
            desk.open(generated);
            
        }catch(Exception e){
            System.out.println(e);
            if(!location.exists()){
                location.createNewFile();
                paint();
            }
        }
    }
   

}