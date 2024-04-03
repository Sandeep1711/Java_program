package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		 
		int arr[]= {4,6,2,7,2,5,2,1,4};
		
		HashMap<Integer, Integer> hp = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(hp.containsKey(arr[i]))
			{
				hp.put(arr[i], hp.get(arr[i])+1);
			}
			else
			{
				hp.put(arr[i], 1);
			}
		}
		
		System.out.println("Duplicate element: "); 
		for(Map.Entry<Integer, Integer> ab: hp.entrySet())
		{
			if(ab.getValue()>1)
			{
				System.out.println(ab.getKey()+"---"+ab.getValue());
			}
			
		}
		System.out.println("Unique element: ");
		for(Map.Entry<Integer, Integer> ab: hp.entrySet())
		{
		if(ab.getValue()==1)
		{
			System.out.println(ab.getKey()+"---"+ab.getValue());
		}
		}

	}

}
