package Practice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		// 2 string are said to be anagram if they contains same characters with different order
		
		String str1="peek";
		String str2="keep";
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean res = Arrays.equals(ch1, ch2);
		
		if(res==true)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not");
		}

	}

}
