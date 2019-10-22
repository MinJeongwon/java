package string;

import java.util.Scanner;

public class CompareTo_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ID=fruit, PW=apple
		for (int i = 0; i < 5; i++) {
			Scanner scn=new Scanner(System.in);
			System.out.print("ID : ");
			String ID=scn.next();
			System.out.print("PW : ");
			String PW=scn.next();
			
			if(ID.equals("fruit") && PW.compareTo("apple") == 0) {
				System.out.println("You successfully logged in to this website.");
				break;
			}
			else {
				System.out.println("You did not sign in correctly. Try again.");
				System.out.println(4-i + " trials left.");
			}
		}	
	}

}
