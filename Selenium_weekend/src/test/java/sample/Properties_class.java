package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Properties_class 
{
	@Test void test() throws FileNotFoundException, IOException 
	{
		Properties p=new Properties();
		p.load(new FileInputStream("./Login.properties"));
		
		String un = p.getProperty("password");
		
		System.out.println(un);
		
		
	}
	

}
