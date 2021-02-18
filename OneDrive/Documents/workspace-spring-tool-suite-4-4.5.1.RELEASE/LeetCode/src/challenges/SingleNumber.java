package challenges;

public class SingleNumber {

	public static void main(String[] args) {
		
		
		int[] nums= {14};
		int num=0;
		for(int i=0;i<nums.length;i++) {
			num=num^nums[i];
			}
		
System.out.println("Found "+num);
	}
//public int singleNumber(int[] nums) {
//        
//	return 1;
//    }

}
