import java.io.*;
import java.util.*;

public class IsUnique {
	
	public static void main(String[] args) {
		
		String input;
		Hashtable<Character, String> hs = new Hashtable<Character, String>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String you want to check: ");
		input = s.next();
		for(int i =0; i < input.length(); i++){
			hs.put(input.charAt(i), String.valueOf(i));
		}
		if(hs.size() == input.length()){
			System.out.println("NO duplicate exists");
		}
		else
			System.out.println("Duplicate exists");
	}
}