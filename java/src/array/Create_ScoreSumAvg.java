package array;

public class Create_ScoreSumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] scores = {83, 70, 56, 100, 92, 60};
		
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			System.out.println("student " + (i+1) + " : " + scores [i]);
			sum += scores[i];
		}
		double avg = sum/scores.length;
		
		System.out.println("number of students : " + scores.length);
		System.out.println("sum of scores : " + sum);
		System.out.println("average score : " + avg);
	}
}
