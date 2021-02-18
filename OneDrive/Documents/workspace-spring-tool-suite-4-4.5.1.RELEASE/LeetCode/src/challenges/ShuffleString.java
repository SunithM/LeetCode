package challenges;

public class ShuffleString {

	  public static String restoreString(String s, int[] indices) {
	     // String result=null;
	      char[] arr = new char[s.length()];
	      for(int i=0;i<indices.length;i++) {
	    	  
	    	  arr[indices[i]]=s.charAt(i);
	      }
	      
	      String result=new String(arr);
	      System.out.println(result);
		  return result;
		  
	    }
	public static void main(String[] args) {
		String s= "Hello";
		int indices[]= {0,3,2,1,4};
		ShuffleString.restoreString(s, indices);

	}

}
