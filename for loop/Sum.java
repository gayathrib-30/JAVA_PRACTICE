class Sum 
{
	public static void main(String[] args) 
	{
		int sum=0;
		for(int i=1;i<=5;i++)
		{
			sum=sum+i;
			//System.out.println(sum),don't give inside the for loop because it will give the o/p as one by one(i.e)1,3,6,10,15.
		}
		System.out.println("sum is:"+sum);
	}
}
