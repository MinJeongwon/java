package array;

public class CreatArray_scores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] scores = {83, 90, 87, 93, 78, 75};
		
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		double avg = sum/scores.length;
		System.out.println("The average score of the students : " + avg);
	}

}
