package forTesting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Testing {
	
public void phone_number(String s){
		
		String s1=s.substring(0, 3);
		String s2=s.substring(3, 6);
		String s3=s.substring(6, 10);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}


  public static void main(String[] args) {
	
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number");
	  String s = sc.nextLine();
	  
	  Testing o = new Testing();
	  
	  o.phone_number(s);
	  
}
}