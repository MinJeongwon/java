package array;

public class Create_NamesScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] scores = new int [6];
		String [] names = new String [6];
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("default value when int : " + scores[i]);
		}
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("default value when String : " + names[i]);
		}
	}

}
