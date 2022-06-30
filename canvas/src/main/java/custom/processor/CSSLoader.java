package custom.processor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CSSLoader {
	Properties props;
	public CSSLoader(){
		try {
			load();
		} catch (IOException e) {
			System.out.print("Unable to laod css");
		}
	}
	public void load() throws FileNotFoundException, IOException {
		this.props=new Properties();
		props.load(new FileInputStream("/Canvas/css.properties"));
		
	}
	public String getProperty(String key) {
			return props.getProperty(key);
	}
	
}
