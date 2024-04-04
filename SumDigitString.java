package Practice;

public class SumDigitString {

	public static void main(String[] args) {
		
		String str="13b6vvd9h";
		
		int res = calculateSum(str);
		
		System.out.println("Sum : "+res);
		
	}
	
	static int calculateSum(String str)
	{
		String num="";
		int sum=0;
	    char[] ch=str.toCharArray();
	    
	    for(int i=0;i<ch.length;i++)
	    {
	    	if(Character.isDigit(ch[i]))  // If Digit
	    	{
	    	 num=num+ch[i];	
	    	}
	    	else
	    	{
	    		if(!num.equals(""))
	    		{
	    			sum=sum+Integer.parseInt(num);
	    			num="";
	    		}
	    	}
	    }
	    
	    //sum=sum+Integer.parseInt(num);
	    return sum;
	}

}
