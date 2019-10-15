package array;

public class MultidimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = new int [2][3];
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		
		System.out.println();
		int [][] arr2 = new int [2][];
		arr2[0] = new int[2];
		arr2[1] = new int[3];
		
		System.out.println(arr2.length);
		System.out.println(arr2[0].length);
		System.out.println(arr2[1].length);
	}

}
