package Test;
import java.io.IOException;

import org.testng.annotations.Test;

public class Showdata extends Loaddata {
	
	
	
	
	@Test
	public void showdata() throws IOException
	{
		String Place = getobject("Place");
		System.out.println(Place);
		
		String Name = getobject("Name");
		System.out.println(Name);
		
		
	}
	
	//public static void main(String args[]) throws IOException
	//{
		//Showdata d = new Showdata();
		//d.showdata();
	//}

}
