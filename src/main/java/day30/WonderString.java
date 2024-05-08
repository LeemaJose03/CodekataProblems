package day30;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WonderString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		if(isWonderful(s)) {
			System.out.println("Wonder");
		} else {
			System.out.println("-1");
		}
		
	}
	
	public static boolean isWonderful(String input) {
		
		Set<Character> charSet = new HashSet<Character>();
		
		for(int i=0;i<input.length();i++) {
			
			char c = input.charAt(i);
			charSet.add(c);
			if(charSet.size() > 3) {
				return false;
			}
			
		}
		return charSet.size()==3;
			
		
		
	}

}
