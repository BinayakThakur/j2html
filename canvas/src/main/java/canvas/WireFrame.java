package canvas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class WireFrame{
	   Properties props=new Properties();
	   String saveAt;
	   File location;
	   static String meta;
	   protected static String title;
	   protected static StringBuilder components;
	   String file;
	   public void init() throws FileNotFoundException, IOException {
		   props.load(new FileInputStream("/Canvas/meta.properties"));
		   file="<!DOCTYPE html><html><head>"+"<title>"+title+"</title>"+"</head><body>"+components.toString()+"</body></html>";
		   saveAt=props.getProperty("HTML_LOCATION");
		   components=new StringBuilder("Please use the canvas to edit");
		   location=new File(saveAt);
	   }
	   
	 
}
