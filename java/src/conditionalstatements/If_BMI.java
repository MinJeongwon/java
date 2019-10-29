package conditionalstatements;

import java.util.Scanner;

public class If_BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		//height
		System.out.print("Please enter your height(cm) : ");
		double h=scn.nextDouble();
		System.out.println();
		
		//height cm into m
		double hm=h/100;
		
		//weight
		System.out.print("Please enter your weight(kg) : ");
		double w=scn.nextDouble();
		System.out.println();
		
		//BMI		
		double BMI=w/Math.pow(hm, 2);
		System.out.printf("Your BMI : %.2f\n", BMI);

		if(BMI>=30)
			System.out.println("obesity");
		else if(BMI>=25)
			System.out.println("overweight");
		else if(BMI>=18.5)
			System.out.println("normal weight");
		else
			System.out.println("underweight");
	}
}