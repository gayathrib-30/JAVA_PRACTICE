class AddDigits 
{
	public static void main(String[] args) 
	{
		int n=123456;
		int sum=0;
		while(n>0)
		{
			int lastdigit=n%10;
			if(lastdigit%2==0){
				sum=sum+lastdigit;
				System.out.println(sum);
				
			}
			n=n/10;
		}
		
	}
}
