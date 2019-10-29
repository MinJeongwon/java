package conditionalstatements;

import java.util.Scanner;

public class If_Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("Please enter any integer number : ");
		int n=Integer.parseInt(scn.next());

		if(n%3==0 && n%5==0) 
			System.out.println("The number is a multiple of 15.");
		else if(n%3==0 && n%5!=0) 
			System.out.println("The number is a multiple of 3.");
		else if(n%5==0 && n%3!=0) 
			System.out.println("The number is a multiple of 5.");
	}

}
