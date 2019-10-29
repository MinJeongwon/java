package conditionalstatements;

import java.util.Scanner;

public class Switch_Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("Please enter your test score : ");
		int test=Integer.parseInt(scn.next());
		
		int share=test/10;
		switch(share) {
		case 10:
		case 9:
			System.out.println("grade : A");
			break;
		case 8:
			System.out.println("grade : B");
			break;
		case 7:
			System.out.println("grade : C");
			break;
		case 6:
			System.out.println("grade : D");
			break;
		default:
			System.out.println("grade : F");
			break;			
		}
	}

}
