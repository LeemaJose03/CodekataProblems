package day30;

import java.util.Scanner;

public class ConvertString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int conversionType = sc.nextInt();
		int p = sc.nextInt();
		
		System.out.println(performConversion(s, conversionType, p));
	}

	public static String performConversion(String s, int conversionType, int p) {
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<s.length();i++) {
			
			char c = s.charAt(i);
			if((i + 1)%p == 0) {
				
				if(conversionType == 1) {
					result.append(Character.toLowerCase(c));
					
				} else if(conversionType == 2) {
					result.append(Character.toUpperCase(c));
				}
				
				
			} else {
				result.append(c);
			}
		}
		
		return result.toString();
	}
}
