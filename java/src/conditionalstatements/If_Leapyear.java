package conditionalstatements;

import java.util.Scanner;

public class If_Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("Please enter the year : ");
		int y=Integer.parseInt(scn.next());
		
		if(y%4==0 && y%100!=0 || y%400==0) 
			System.out.println("It is a leap year.");
		else
			System.out.println("It is a common year.");
	}
}
