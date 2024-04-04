package Practice;

import java.util.Stack;

public class Balanceparen {

	public static void main(String[] args) {
		
		String str="{[]}";
		System.out.println(balance(str));
			}
	
	
	public static boolean balance(String str)
	{
		char[] ch = str.toCharArray();
		
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='[' || ch[i]=='{' || ch[i]=='(')
			{
				st.push(ch[i]);
			}
			else
			{
				char popElement = st.pop();
				
				if(popElement == '{' && ch[i]!='}')
				{
					return false;
				}
				if(popElement == '[' && ch[i]!=']')
				{
					return false;
				}
				if(popElement == '(' && ch[i]!=')')
				{
					return false;
				}
			}
		}
		return st.size()==0;
	}
}
