import java.io.*;
import java.util.*;
//the import statements allow us to import classes from java_installation/java/io folder

/**
 * author : Sagar Tewari
 */

class palindromePerm {
	
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the string to test");
		String input = s.next();
		boolean ret = checkPalindrome(input);
		if(ret){
			System.out.println("YES");
		}
		else
			System.out.println("NO");

	}

	static boolean checkPalindrome(String input){
		boolean array[] = new boolean[128];
		int trueCount = 0;
		for(int i =0; i< input.length(); i++){
			int val = input.charAt(i);
			if(!array[val])
				array[val] = true;
			else
				array[val] = false;
		}
		for(boolean b : array){
			if(b){
				trueCount++;
			}
		}
		if(trueCount==1){
			return true;
		}
		else
			return false;
	}
}