package Practice;

import java.util.Stack;

public class Reverse {

	public static void main(String[] args) {
		
	    /*
		1. Reverse using for loop from n-1 to 0
	    2. Reverse using Stack
		*/
		
		String str = "sandeep";
		
		char[] ch = str.toCharArray();
		
		int n= ch.length;
		
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		
		System.out.println();
		
		String stk = "Stack";
		
		char[] ch1 = stk.toCharArray();
		
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0;i<ch1.length;i++)
		{
			st.push(ch1[i]);
		}
		
		// Using stack
		while(!st.isEmpty())
		{
			System.out.print(st.pop());
		}
		
		

	}

}
