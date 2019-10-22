package string;

import java.util.Scanner;

public class IndexOf_Bookstore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//book list
		String [] books= {"java programming","C# programming","Easy Java Programming","Master of JAVA","Power Builder","Oracle and Java-JDBC"};
		int sw=0;
		
		Scanner scn=new Scanner(System.in);
		System.out.print("Please enter your keywords. \nAll available books will be searched. \nkeywords : ");
		String booksearch=scn.next();
		
		//indexOf : used to find the index of a specified character or a substring in a given String 
		for (int i = 0; i < books.length; i++) {
			if(books[i].toUpperCase().indexOf(booksearch.toUpperCase())!=-1) {
				System.out.println(books[i]);
				sw=1;
			}
		}
		if(sw==0)
			System.out.println("The book is not in stock.");
	}

}
