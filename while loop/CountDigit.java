import java.util.Scanner;
class CountDigit //explanation in note also
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the numbers:");
		int n=sc.nextInt();
		int count=0;
		while(n>0)
		{
			n=n/10;//removes the last digit and then count how many digits have been removed
			count++;
			System.out.println(n +" "+count);//for understanding purpose
		}
		System.out.println("the count is:" +count);
		
	}
}
