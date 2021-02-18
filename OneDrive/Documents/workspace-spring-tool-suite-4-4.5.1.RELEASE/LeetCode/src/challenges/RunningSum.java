package challenges;

public class RunningSum {

	
	    public static int[] runningSum(int[] nums) {
			//2,3,6,7,8
	    	int rsum=0;
	    	int result[]=new int[nums.length];
	    	for(int i=0;i<nums.length;i++) {
	    		if(i==0) {
	    			result[i]=nums[i];
	    			rsum=nums[i];
	    			System.out.println(result[i]);
	    		} else {
	    		//int temp=nums[i];
	    		rsum+=nums[i];
	    		result[i]=rsum;
	    		System.out.println(result[i]);
	    		}
				
			}
	    	
	    	return result;
	        
	    }
	
	public static void main(String[] args) {
		int nums []= {2,3,6};
		RunningSum.runningSum(nums);

	}

}
