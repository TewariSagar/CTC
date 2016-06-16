import java.io.*;
import java.util.*;

class StringRotation {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first String");
		String firstString = s.next();
		System.out.println("Enter the second String");
		String secondString = s.next();
		StringRotation onj = new StringRotation();
		onj.checkRotation(firstString,secondString);
	}

	void checkRotation(String firstString, String secondString){
		firstString = firstString +firstString;
		boolean ret = isSubstring(firstString, secondString);
		if(ret)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	boolean isSubstring(String firstString, String secondString){
		if(firstString.contains(secondString))
			return true;
		else
			return false;
	}
}