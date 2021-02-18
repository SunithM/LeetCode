package challenges;

public class ShuffleTheArray {
	public int[] shuffle(int[] nums, int n) {
        //int mid=n/2;
        int []result;
        result=new int[n*2];
       // 2,5,1,3,4,7
        int ri=0;
       for(int i=0;i<n;i++)
       {
    	   if(i%2==0) {
    	   result[ri]=nums[i];
    	   result[ri+1]=nums[i+n];
    	   ri+=2;
    	   }else {
    		   result[ri]=nums[i];
    		   result[ri+1]=nums[i+n];
    		   ri+=2;
    	   }
    		  
       }
       for(int i=0;i<n*2;i++)
       {
    	   System.out.println(result[i] +" ");
       }

       return result;
    }

	public static void main(String[] args) {
		int a[]= {2,5,7,8};
		ShuffleTheArray obj=new ShuffleTheArray();
		System.out.println(obj.shuffle(a, 2));
	}

}
