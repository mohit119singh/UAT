package forTesting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class Testing {
	
	
@Test	
public void paste_xml() throws IOException{
		
		File f = new File("C:\\Selenium\\Workspace\\PTA.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		//StringBuilder sb = new StringBuilder();
		String line=br.readLine();
		while(line!=null){
			
			String tt=line;
			line=br.readLine();
			System.out.println(tt);	
		}
		
		

}
}