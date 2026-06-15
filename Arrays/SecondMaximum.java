class SecondMaximum 
{
	public static void main(String[] args) 
	{
		int arr[]={2,1,5,9,4,7};
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				smax=max;
				max=arr[i];
			}
			else if(arr[i]>smax &&arr[i]!=0)
			{
				smax=arr[i];
			}
		}
		System.out.println(smax);
		//System.out.println(max);
	}
}
