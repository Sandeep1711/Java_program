package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SortbyFrequency {

	public static void main(String[] args) {
		
		/*
		1. Storing element in Hashmap with frequency
		2. Fetch entrySet() from HashMap and store in ArrayList
		3. Use Collections.sort(al, by using frequency)
		4. Override the compare() method
		5. Fetch element from Array List and print on console   
		*/
		
		String str= "sandeepseeedddddaaa";
		
		char[] ch = str.toCharArray();
		int len=ch.length;
		
		HashMap<Character, Integer> hp = new HashMap<Character, Integer>();

		for(int i=0;i<len;i++)
		{
			if(hp.containsKey(ch[i]))
			{
			 hp.put(ch[i], hp.get(ch[i])+1);	
			}
			else
			{
				hp.put(ch[i], 1);
			}
		}
		
		ArrayList<Map.Entry<Character,Integer>> al = new ArrayList<Map.Entry<Character,Integer>>(hp.entrySet());
		
		Collections.sort(al, new Comparator<Map.Entry<Character,Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue() - o1.getValue();
			}
		});
		
		for(Map.Entry<Character, Integer> e: al)
		{
			int freq = e.getValue();
			
			while(freq >=1)
			{
				System.out.print(e.getKey()+"");
				freq--;
			}
		}
	}

}
