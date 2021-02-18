package challenges;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int a[]= {1,3,5,7,9,10};
		SearchInsert obj=new SearchInsert();
		
		System.out.println(obj.searchInsert(a, 1));
		
		// TODO Auto-generated method stub

	}

}

class SearchInsert {
    public int searchInsert(int[] nums, int target) {
    	int pos=0;
        for(int i=0;i<nums.length;i++)
        {
        	if(target>=nums[i])
        	{
        		if(target==nums[i])
        			pos=i;
        			else
        				pos= i+1;
        	}
        }
        return pos;
    }
}
