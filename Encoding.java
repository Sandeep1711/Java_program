package Practice;

public class Encoding {

	public static void main(String[] args) {
		
		String str="aaaabbbccdddd";  //o/p - a4b3c2d4
		char[] ch = str.toCharArray();
		char temp = ch[0];
		
		int count=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==temp)
			{
				count++;
			}
			else
			{
				System.out.print(temp +"-"+count+" ");
				count=1;              // Reset
				temp=ch[i];           // Change New character
			}
		}
		
		System.out.print(temp +"- "+count);
	}

}
