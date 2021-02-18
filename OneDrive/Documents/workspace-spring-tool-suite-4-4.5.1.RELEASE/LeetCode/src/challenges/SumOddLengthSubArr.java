package challenges;

public class SumOddLengthSubArr {
	public static int sumOddLengthSubArray(int[] arr) {
		int total = 0;
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			int sum = 0;
			for (int j = i; j < len; j++) {
				sum += arr[j];
				if (((j - i)) % 2 != 1)//i=2 j=2,2  
					total += sum;
			}
		}
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 4, 2 ,2,5};
		System.out.println(SumOddLengthSubArr.sumOddLengthSubArray(arr));

	}

}
