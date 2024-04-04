package Practice;

public class RevGroupSize {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int k=7;
		
		int n=arr.length;
		
		for(int i=0;i<n;i=i+k)
		{
			int left=i;
			int right=Math.min(i+k-1, n-1);  // to handle special case when last may contain less than k size
			
			while(left<right)
			{
				int temp = arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
			
		}

		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
