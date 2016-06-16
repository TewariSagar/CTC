import java.util.*;
import java.io.*;

class ZeroMatrix {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int m = s.nextInt();
		System.out.println("Enter the number of columns");
		int n = s.nextInt();
		int[][] arr = new int[m][n];
		ZeroMatrix obj = new ZeroMatrix();
		//time to fill in the matrix
		obj.printZero(arr,s,m,n);
	}
	void printZero(int[][] arr, Scanner s,int m, int n){
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				System.out.println("Enter the elements row wise");
				arr[i][j] = s.nextInt();
			}
		}
		System.out.println();

		int val = Math.max(m,n);
		int[] storage = new int[val];
		for(int i =0; i < m; i++){
			for(int j=0; j< n; j++){
				if(arr[i][j] == 0){
					storage[i] = j+1;
				}
			}
		}

		for(int i=0; i < storage.length; i++){
			if(storage[i] != 0){
				System.out.println(storage[i]);
				for(int j=0; j<n; j++){
					arr[i][j]=0;
				}
				for(int k=0; k<m; k++){
					int x = storage[i];
					arr[k][x-1]=0;
				}
			}
			
		}
		for(int i=0; i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();

		}
	}
}