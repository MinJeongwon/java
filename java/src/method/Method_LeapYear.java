package method;

import java.util.Scanner;

public class Method_LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		year();
	}

	private static void year() {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("Is _____ a leap year?    ");
		System.out.print("Enter the year : ");
		int year=Integer.parseInt(scn.next());
		
		if(year%4==0 && year%100 !=0 || year%400==0)
			System.out.println("Yes, it is a leap year.");
		else
			System.out.println("No, it is a common year.");		
	}
}
