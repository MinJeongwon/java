package date;

import java.util.Date;

public class Dateclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1=new Date();
		System.out.println("today's date : " +d1);
		System.out.println("today's date : " +d1.toLocaleString());
		System.out.println();
		
		Date gw=new Date(1000L);
		System.out.println(gw);
		System.out.println(gw.toLocaleString());
		System.out.println();
		
		System.out.println(d1.getDay());
		String [] days= {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		System.out.println(days[d1.getDay()]);
	}

}
