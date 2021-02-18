package challenges;
import java.util.Arrays;

public class RemoveElement {
	
	    public int removeElement(int[] nums, int val) {
	    	int change = 0;
	        for (int i = 0; i < nums.length; i++) {
				if (nums[i] != val) {
					change ++;
				}else {
					break;
				}
			}
	        
	        for (int i = change + 1; i < nums.length; i++) {
				if (nums[i] != val) {
					nums[change++] = nums[i];
				}
			}
	        System.out.println("Resultant Array: "
                    + Arrays.toString(nums));
	        return change;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveElement ob =new RemoveElement();
		int nums[]={1,1,1,6,1,7};
		System.out.println(ob.removeElement(nums,1));

	}

}
