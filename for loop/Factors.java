import java.util.Scanner;
class Factors 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)//here i starts from 0 because all the numbers starts from the range 1-that particular number
			{
			if(n%i==0){
				System.out.println(i);
			}
			
		}
	}
}
