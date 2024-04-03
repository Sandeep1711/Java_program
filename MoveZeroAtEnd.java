package Practice;

public class MoveZeroAtEnd {

	public static void main(String[] args) {
		
		int arr[]= {12,0,43,23,0,0,34,12,44};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[j]!=0)
					{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					}
				}
			}
		}
		
		System.out.println("Move zero at end : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
