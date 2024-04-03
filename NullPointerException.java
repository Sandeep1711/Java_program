package Practice;

public class NullPointerException {

	public static void main(String[] args) {
		
		/*
		 * Example 1: using String
		 */
		String str=null;         	// If we pass str = "sandeep" , exception get resolved
		int len = str.length(); 	// NullPointer exception
		System.out.println("Length : "+str);
		
		/*
		 * Example 2 using array
		 */
		int a[]=null;  // To resolve it , {'1','2','3','4'}
		System.out.println(a[0]);
	}

}
