import java.util.Scanner;
class Learningthrow 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Start");
		System.out.print("Enter your age:");
		int age=sc.nextInt();
		if(age>=21)
			System.out.println("you can ride");
		else
			throw new ArithmeticException("Ypu can't ride");
	}
}