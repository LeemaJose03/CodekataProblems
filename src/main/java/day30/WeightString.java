package day30;

import java.util.Scanner;

public class WeightString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(calculateWeight(s));
	}
	
	
	public static int calculateWeight(String s) {
		
		int weight =0;
		for(int i=0 ; i< s.length();i++) {
			
			char c = s.charAt(i);
			weight += (int) c;  // Adding ASCII value of the character
		}
		
		return weight;
	}
	

}
