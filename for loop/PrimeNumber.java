import java.util.Scanner;
class PrimeNumber 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		int count=0;//we are using count because prime number is divisible by 1 and ifself so when the count is 2 it is prime(for eg 7,count=1,7).
		for(int i=1;i<=n;i++)
		{
			if(n%i==0){
				count++;
			}
		}
		if(count==2){
			System.out.println("IT IS PRIME NUMBER");
		}
		else{
			System.out.println("IT IS NOT A PRIME NUMBER");
		}
	}
}
