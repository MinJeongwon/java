package array;

public class MultidimensionalArrays_Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3*3 stars
		String [][] stars=new String [3][3];
		for (int i = 0; i < stars.length; i++) {
			for (int j = 0; j < stars.length; j++) {
				stars[i][j]="*";
				System.out.print(stars[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		
		//3*5 stars
		String [][] stars2=new String[3][5];
		
		for (int i = 0; i < stars2.length; i++) {
			for (int j = 0; j < stars2[i].length; j++) {
				stars2[i][j]="*";
				System.out.print(stars2[i][j]);
			}
			System.out.println();
		}
		
	}

}
