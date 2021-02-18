package challenges;

public class SumOfRow {
	public static int maxSumOfRow(int[][] arr) {
		int max = 0;
		int tempMax = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				tempMax = tempMax + arr[i][j];

			}
			max=Math.max(tempMax, max);
			tempMax = 0;
		}

		return max;
	}

	public static void main(String[] args) {
		int arr[][] = { { 2, 8, 7 }, { 7, 1111, 3 }, { 89, 0, 8 } };
		System.out.println(maxSumOfRow(arr));

	}

}
