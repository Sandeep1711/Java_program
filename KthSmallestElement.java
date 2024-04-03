package Practice;

public class KthSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {44,22,11,33,55};
		int key=2;
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
			if(i==key-1)
			{
				System.out.println(key+" Smallest element - "+arr[i]);
			}
			else
			{
				System.out.println("Element not present");
			}
		}

	}

}
