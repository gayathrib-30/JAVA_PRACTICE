@FunctionalInterface
interface operation
{
	void multiply();
}
interface operation2
{
	void division(int a,int b);
}
interface operation3
{
	int add(int a ,int b);
}
class Lambda
{
	public static void main(String[] args) 
	{
		operation op=()->{
				System.out.println("multiply is "+(2*4));
			};
		op.multiply();
		//lambda expression with parameters
		operation2 op2=(a,b)->{
			System.out.println("division is:"+(a/b));
		};
		op2.division(40,30);
		//lambda expression with return type
		operation3 op3=(a,b)->{
			return a+b;
		};
		System.out.println("addition is:"+op3.add(5,5));
	}
}
