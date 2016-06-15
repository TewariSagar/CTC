import java.util.*;
import java.io.*;

class oneaway{
	public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the first string");
	String firstString = s.next();
	System.out.println("Enter the second string");
	String secondString = s.next();
	checkoneaway(firstString, secondString);
	}

	static void checkoneaway(String firstString, String secondString){
		int count =0;
		if(firstString.length() + 1 == secondString.length()){
			int i = 0 ;
			int incIndex = 0;
			while(incIndex < secondString.length())
			{
				if(firstString.charAt(i) == secondString.charAt(incIndex)){
					count++;
					if((i != firstString.length() -1))
					i++;
					incIndex++;
				}
				else
					incIndex++;
			}
			if((count == secondString.length()-1))
				System.out.println("true");
			else
			System.out.println("false");

		}
		if(firstString.length() - 1 == secondString.length()){
			int i = 0 ;
			int incIndex = 0;
			while(incIndex < firstString.length())
			{
				if(secondString.charAt(i) == firstString.charAt(incIndex)){
					count++;
					if((i != secondString.length() -1))

					i++;
					incIndex++;
				}
				else
					incIndex++;
			}
			if((count == firstString.length()-1))
				System.out.println("true");
			else
				System.out.println("false");

		}
		if(firstString.length() == secondString.length()){
			int i =0;
			int incIndex = 0;
			while( i < firstString.length()){
				if(firstString.charAt(i) == secondString.charAt(i)){
					i++;
					count++;
				}
				else
					i++;
			}
			if(count == firstString.length()-1)
				System.out.println("true");
			else
				System.out.println("false");				
			
		}
	}
}
