package sort;

import java.util.Arrays;

public class Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers= {100, 246, 51, 642, 2, 9800, 73};
		System.out.println("< numbers >");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "  ");
		}
		System.out.println();
		
		//ascending order
		System.out.println("< ascending order >");
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "  ");
		}
		System.out.println();
		
		//descending order
		System.out.println("< descending order >");
		for (int i = numbers.length-1; i >= 0 ; i--) {
			System.out.print(numbers[i] + "  ");
		}	
		
	}

}
