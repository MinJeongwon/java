package sort;

public class Bubblesort_ScoresAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] a= {"Albert", "Brad", "Chris", "Dan", "Edward"};
		int [] b = {95, 50, 35, 70, 90};
		
		for (int i = 0; i < b.length-1; i++) {
			for (int j = 0; j < b.length-1-i; j++) {
				if(b[j]>b[j+1]) {
					int x=b[j];
					b[j]=b[j+1];
					b[j+1]=x;
					String y=a[j];
					a[j]=a[j+1];
					a[j+1]=y;
				}
			}
			
		}
		System.out.println("< scores >");
		for (int i = 0; i < b.length; i++) {
			System.out.println(a[i] + "\t" + b[i]);
		}
	}

}