package day30;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicatePassport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		
		String[] passports = sc.nextLine().split(" ");
		
		Set<String> uniquePassort = new HashSet<String>();
		
		for(String passport : passports) {
			
			uniquePassort.add(passport);
		}
		
		for(String passport: uniquePassort) {
			System.out.println(passport + " ");
		}
	}

}
