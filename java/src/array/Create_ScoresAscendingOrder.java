package array;

public class Create_ScoresAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] a= {"Albert", "Brad", "Chris", "Dan", "Edward"};
		int [] b = {95, 50, 35, 70, 90};
		
		for (int i = 0; i < b.length-1; i++) {
			if(b[i]>b[i+1]) {
				int x=b[i];
				b[i]=b[i+1];
				b[i+1]=x;
				String y=a[i];
				a[i]=a[i+1];
				a[i+1]=y;
			}
		}
		System.out.println("< scores >");
		for (int i = 0; i < b.length; i++) {
			System.out.println(a[i] + "\t" + b[i]);
		}
	}

}
