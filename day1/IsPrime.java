package week1.day1;

import java.util.Iterator;

public class IsPrime {

	public static void main(String[] args) {
		int n=13;
		int count=0;
		
		for(int i=1; i<=n; i++)
		 {
			 if(n%i==0)
			 {
				 count++;
			 }
		 }
		if(count==2)
		{
			System.out.println("Is Prime");
		}
		else
		{
			System.out.println("Is not Prime");
		}

	}

}
