package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile 
{
	public static String readData(String keyname)
	{
		String value=null;
		try {
		Properties p=new Properties();
		p.load(new FileInputStream("./src/test/java/utils/shopperUrl.properties"));
		value=p.getProperty(keyname);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return value;
	}

}
