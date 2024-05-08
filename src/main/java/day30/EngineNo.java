package day30;

import java.util.Scanner;

public class EngineNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String plateNumber = sc.nextLine();
		
		System.out.println(calculateEngineNumber(plateNumber));
	}

	
	public static int calculateEngineNumber(String plateNumber) {
		
		int engineNumber =0;
		for(int i =0;i<plateNumber.length();i++) {
			
			char c = plateNumber.charAt(i);
			if(Character.isDigit(c)) {
				engineNumber += Character.getNumericValue(c);  
				
			}
			
		}
		return engineNumber;
	}
}
