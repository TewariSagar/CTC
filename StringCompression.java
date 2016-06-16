import java.io.*;
import java.util.*;

class StringCompression{
	
	public static void main(String args[]){

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string you want to compress");
		String input = s.next();
		StringCompression obj = new StringCompression();
		obj.compress(input);
	}

	 void compress(String input){
		int count = 0;
		StringBuilder str = new StringBuilder();
	for(int i =0 ; i < input.length(); i ++){
		count++;
		if((i+1 >= input.length()) || (input.charAt(i)!=input.charAt(i+1))){
			str.append(input.charAt(i));
			str.append(count);
			count = 0;
		}
	}
	String x = (str.toString().length() < input.length()) ? str.toString(): input;
		System.out.println(x);
	}	
	
}


