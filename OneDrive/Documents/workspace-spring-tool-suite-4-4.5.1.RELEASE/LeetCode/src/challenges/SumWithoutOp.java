package challenges;

public class SumWithoutOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution10 obj=new Solution10();
		System.out.println(obj.getSum(5, 4));
		System.out.println(5^4);

	}

}
class Solution10 {
    public int getSum(int a, int b) {
        if(a==0 || b==0)
        {
            return a^b;
        }
        else
        {
            return getSum(a^b, b=(a&b)<<1);
        }
    }
}
