class AddEven 
{
	public static void main(String[] args) 
	{
		int n=123456;
		int sum=0;
		while(n>0)
		{
			int lastdigit=n%10;
			sum=sum+lastdigit;
			n=n/10;
		}
		System.out.println(sum);
	}
}



//iteration
//1.n=12345>0
//ld=5//n%10 takes the last digit
//sum=0+5=>sum=5
//n=n/10 //removes the last digit i.e 5
//2.n=1234>0
//ld=4
//sum=5+4=>sum=9
//n=n/10//removes 4
//similarly all other iteration shpuld be done

