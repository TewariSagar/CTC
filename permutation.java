import java.io.*;
import java.util.*;

/**
 * author : Sagar Tewari
 */
class permutation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first string");
		String firstString = s.next();
		System.out.println("Enter the string you want to test with");
		String secondString = s.next();
		boolean ret = checkPermutation(firstString, secondString);
		if(ret)
			System.out.println("YES it is a permutation");
		else
			System.out.println("NO it is not a permutation");
	}

	static boolean checkPermutation(String firstString, String secondString){
		if(firstString.length() != secondString.length())
			return false;
		Character arr[] = new Character[firstString.length()];
		Character arr2[] = new Character[secondString.length()];
		for(int i =0; i < firstString.length(); i++)
		{
			arr[i] = firstString.charAt(i);
			arr2[i] = secondString.charAt(i);
		}
		Arrays.sort(arr);
		Arrays.sort(arr2);
		if(Arrays.equals(arr,arr2))
		return true;
		else
			return false;
	}
}
