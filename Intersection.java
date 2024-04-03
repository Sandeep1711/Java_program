package Practice;

import java.util.HashSet;

public class Intersection {

	public static void main(String[] args) {
		
		int a[]= {10,20,50,8,9,4,3};
		int b[]= {4,9,8,88,99,77,44};
		
		// Common element present in both the Array
		
		int count=0;
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		
		System.out.println("Common elements");
		for(int i=0;i<b.length;i++)
		{
			if(hs.contains(b[i]))
			{
				System.out.print(b[i]+"\t");
				count++;
			}
		}
		System.out.println();
		System.out.println("No. of common element: "+count);
	}

}
