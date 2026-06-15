import java.util.Scanner;
class  Vowels
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter one character:");
		char ch=sc.next().charAt(0);
		switch(ch)//we cannot able to take long,float,double,boolean in the switch statement.
			{
			case 'a','e','i','o','u':
				System.out.println("vowels are in lowercase");
				break;
			case 'A','E','I','O','U':
				System.out.println("Vowels are in the uppercase");
				break;
			default:
				System.out.println("invalid character i.e consonanat");
		}
	}
}
