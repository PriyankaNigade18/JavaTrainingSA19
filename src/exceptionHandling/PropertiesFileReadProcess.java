package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReadProcess {

	public static void main(String[] args) throws IOException, InterruptedException 
	{

		//file instance= path of the file
		File f1=new File(System.getProperty("user.dir")+"//FileData//config.properties");
		
		//to read data in stream
		FileInputStream fs=new FileInputStream(f1);
		
		//Properties class
		Properties p1=new Properties();
		p1.load(fs);
		
		
		Thread.sleep(2000);
		
		System.out.println(p1.getProperty("bname"));
		System.out.println(p1.getProperty("un"));
		
		
		
		
		
		
		
		

	}

}
