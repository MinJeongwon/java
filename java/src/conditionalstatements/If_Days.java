package conditionalstatements;

import java.util.Scanner;

public class If_Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Please enter a month \nex.January -> 1 \n   December -> 12 ");
		int m=Integer.parseInt(scn.next());
		
		if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
			System.out.println("It has 31 days.");
		else if(m==4 || m==6 || m==9 || m==11)
			System.out.println("It has 30 days.");
		else if(m==2) {
			System.out.print("Which year? : ");
			int y=Integer.parseInt(scn.next());
			if(y%4==0 && y%100!=0 || y%400==0)
				System.out.println("It has 29 days.");
			else
				System.out.println("It has 28 days.");
		}
	}

}
