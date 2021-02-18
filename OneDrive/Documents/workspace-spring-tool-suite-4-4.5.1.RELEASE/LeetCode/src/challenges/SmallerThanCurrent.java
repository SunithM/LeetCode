package challenges;

public class SmallerThanCurrent {

public static  int[] smallerNumbersThanCurrent(int[] nums) {
       int [] result=new int[nums.length];
       for(int i=0;i<nums.length;i++) {
    	   int j=0;
    	   int count=0;
    	   while(j<nums.length) {
    		   if(i !=j && nums[i]>nums[j]) {
    			   count++;
    		   }
    		   result[i]=count;
    		   
    		   j++;
    	   }
    	  // System.out.println(result[i]+" ");
       }
       return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {8,1,2,2,3};
		int res[]=SmallerThanCurrent.smallerNumbersThanCurrent(nums);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}

	}

}
