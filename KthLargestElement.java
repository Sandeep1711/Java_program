package Practice;

public class KthLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {30,50,20,40,60,10,70,80};
		int key=5;
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
			if(i==key-1)
			{
				System.out.println(key+" largest element - "+arr[i]);
			}
			else
			{
				System.out.println("Element not present");
			}
		}

	}

}
