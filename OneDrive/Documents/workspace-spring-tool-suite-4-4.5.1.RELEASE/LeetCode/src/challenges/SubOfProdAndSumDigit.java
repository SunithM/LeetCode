package challenges;

public class SubOfProdAndSumDigit {
public static int subtractProductAndSum(int n) {
     int digit;
     int sum=0;
     int prod=1;
     while(n>0) {
    	 digit=n%10;
    	 prod=digit*prod;
    	 sum=digit+sum;
    	 n=Math.floorDiv(n, 10);
     }
	return prod-sum;
    }
	public static void main(String[] args) {
		int n=123;
		System.out.println(SubOfProdAndSumDigit.subtractProductAndSum(n));

	}

}
