package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Loaddata {
 static Properties properties;
 
 public static void loaddata() throws IOException
 {
	 properties = new Properties();
	 File f = new File(System.getProperty("user.dir")+"\\src\\Testconfig\\config.properties");
	 FileReader obj = new FileReader(f);
	 properties.load(obj);
	 }
 
 public static String getobject(String Data)throws IOException
 {
	 loaddata();
	 String data = properties.getProperty(Data); 
	 return data;
	 
	 
 }


}