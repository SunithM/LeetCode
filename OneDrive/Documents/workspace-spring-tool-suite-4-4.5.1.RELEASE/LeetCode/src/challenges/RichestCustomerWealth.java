package challenges;

public class RichestCustomerWealth {
	 public static int maximumWealth(int[][] accounts) {
	     int max=Integer.MIN_VALUE;
	     for(int j=0;j<accounts.length;j++) {
	    	 if(max< money(accounts[j])) {
	    		 max=money(accounts[j]);
	    	 }
	     }
		 return max;
	    }
	private static int money(int[] is) {
		int count=0;
		for(int i=0;i<is.length;i++) {
			count=count+is[i];
		}
		return count;
	}
	public static void main(String[] args) {

		int [][] accounts= {{1,2,3},{3,10,1},{2,4,70}};

		System.out.println(maximumWealth(accounts));
		
	}

}
