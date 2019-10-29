package conditionalstatements;

import java.util.Scanner;

public class Switch_Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Please enter a month \nex.January -> 1 \n   December -> 12 ");
		int m=Integer.parseInt(scn.next());
		
		switch(m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("It has 31 days.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("It has 30 days.");
			break;
		case 2:
			System.out.print("Which year? : ");
			int y=Integer.parseInt(scn.next());
			if(y%4==0 && y%100!=0 || y%400==0)
				System.out.println("It has 29 days.");
			else
				System.out.println("It has 28 days.");
			break;
		}

	}

}
