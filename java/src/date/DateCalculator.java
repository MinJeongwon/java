package date;

import java.util.Date;

public class DateCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println("What date is it today?");
		System.out.println("today : " + d.toLocaleString());
		System.out.println("What would be 100 days from today?");
		d.setDate(d.getDate()+100-1);
		System.out.println("100 days from today : " + d.toLocaleString());
	}

}
