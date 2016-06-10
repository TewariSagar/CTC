import java.util.*;
import java.io.*;

//this problem is solved assuming the string is ASCII
//TIME COMPLEXITY O(n)
//SPACE COMPLEXITY O(1)
class IsUniqueBitVector{

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String input = s.next();
		boolean ret = checkUniqueness(input);
		if(ret == true){
		System.out.println("DUPLICATE PRESENT");
		}
		else
		System.out.println("DUPLICATE ABSENT");
	}

	static boolean checkUniqueness(String input){
		if(input == null)
		return false;
		boolean charArray[] = new boolean[128];
		for(int i =0; i< input.length(); i++)
		{
			int x = input.charAt(i);
			if(charArray[x] == true)
			return true;
			charArray[x] = true;
		}
		return false;
	}
} 