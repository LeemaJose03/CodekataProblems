package day30;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int totalLength = n+m;
		
		int[] array1 = new int[n];
		int[] array2 = new int[m];
		
		for(int i=0; i<n;i++) {
			array1[i] = sc.nextInt();
		}
		
		for(int i=0; i<m;i++) {
			array2[i] = sc.nextInt();
		}
		
		// sort array1 in asscending
		Arrays.sort(array1);
		
		// sort array2 in decending
		
		Arrays.sort(array2);
		reverse(array2);
		
		// Merge
		
		int[] mergeArray = new int[totalLength];
		System.arraycopy(array1, 0, mergeArray, 0, n);
		System.arraycopy(array2, 0, mergeArray, n, m);
		
		for(int i=0;i<totalLength;i++) {
			
			System.out.print(mergeArray[i]+" ");
		}
		
	}
	
	public static void reverse(int[] arr) {
		int left =0; 
		int right=arr.length-1;
		
		while(left < right) {
			int temp = arr[left];
			arr[left]= arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}

}
