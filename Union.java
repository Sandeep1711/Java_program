package Practice;

import java.util.HashSet;
import java.util.Iterator;

public class Union {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {15,20,5,15};
		int b[]= {15,15,15,20,10};
		
		// Common element + Distinct element
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		
		for(int i=0;i<b.length;i++)
		{
			hs.add(b[i]);
		}
		
		System.out.println("Union of 2 Arrays : "+ hs.size());
		
		Iterator<Integer> it = hs.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
	}

}
