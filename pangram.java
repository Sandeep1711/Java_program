package Practice;

public class pangram {

	public static void main(String[] args) {
		
		String str="abcdefghijklmnopqrstuvwxyz";
		
		System.out.println(checkpangram(str));
	}
	
	static boolean checkpangram(String str)
	{
	    boolean mark[] = new boolean[26];
	    int index=0;
	    
		char[] ch = str.toCharArray();
		int len = str.length();
		
		for(int i=0;i<len;i++)
		{
			if(ch[i]>='A' && ch[i] <='Z')
			{
				index= ch[i]-'A';
			}
			else if(ch[i]>='a' && ch[i] <='z')
			{
				index= ch[i]-'a';
			}
			else
			{
				continue;
			}
			mark[index]=true;
		}
		
		for(int i=0;i<=25;i++)
		{
			if(mark[i]==false)
			{
				return false;
			}
		}
		
		return true;
	}

}
