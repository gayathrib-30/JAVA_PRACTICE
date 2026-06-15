//when ever the sum of the number and the product of the number is same then it is spy number
class SpyNumber 
{
	public static void main(String[] args) 
	{
		int n=1124;
		int sum=0;
		int mul=1;
		while(n>0)
		{
			int ld=n%10;
			sum=sum+ld;
			mul=mul*ld;
			n=n/10;
		}
		System.out.println("the sum is:"+sum);
		System.out.println("the mul is:"+mul);
		if(sum==mul)
		{
			System.out.println("it is spy number");
		}
		else{
			System.out.println("it is not a spy number");
		}
	}
}
