package TW;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		int n,i=0,j;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:-");
		n=sc.nextInt();
		
		for(j=2;j<=n;j++)
		{
			for(i=2;i<=j;i++)
			{
				if(j%i==0)
				{
					break;
				}
			}
		}
		if(j==i)
		{
			System.out.println(j);
		}
		else
			System.out.println("Not Prime");
		
	}
	
	
}
