package string;

public class Stringbuffer {

	public static void main(String[] args) {
		String a="Christmas ";
		String b="party";
		
		a=a+b;
		System.out.println(a);
		System.out.println();
		
		StringBuffer c=new StringBuffer("Happy ");
		c.append("New Year");
		System.out.println("after appending : " + c);
		
		c.reverse();
		System.out.println("after reversing : " + c);
		
		c.delete(1,3);
		System.out.println("after deleting : " + c);
		
		c.replace(0,1, "***");
		System.out.println("after replacing : " + c);
		

		
	}

}
