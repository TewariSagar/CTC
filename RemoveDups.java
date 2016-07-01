//Remove duplicated from an unsorted linked list
import java.util.*;
import java.io.*;

class RemoveDups {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		LinkedList ll = new LinkedList();
		System.out.println("Enter the elements in the linked list and enter 0 to exit...");
		while(true){
			String ip = s.next();
			if(ip.equals("0")){
				break;
			}
			else
				ll.add(ip);
		}
		System.out.println("Link List before deletion: " + ll);
		//default load factor for the hashset here is 0.75
		HashSet<String> hs = new HashSet<String>(ll.size());
		for(int i =0; i < ll.size(); i++){
				if(hs.contains((String) ll.get(i))){
				ll.remove(i);
				i--;
			}
			else{
				hs.add((String) ll.get(i));
			}
		}
		System.out.println("Link list after deletion: "+ ll);
	}
}