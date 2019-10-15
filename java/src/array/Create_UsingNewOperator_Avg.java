package array;

public class Create_UsingNewOperator_Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] scores = null;
		scores = new int [] {83, 70, 56, 100, 92, 60};
		
		double avg = avg( new int [] {83, 70, 56, 100, 92, 60} );
		System.out.println("average score : " + avg);
	}

	private static int avg(int[] scores) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum/scores.length;
	}

}
