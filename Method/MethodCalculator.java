class MethodCalculator 
{
	public static void add(){
		int a=20;
		int b=30;
		System.out.println("Addition is:"+(a+b));
	}
	public static void sub(int a,int b){
		
		System.out.println("Subtraction is:"+(a-b));
	}
	public static void main(String[] args) 
	{
		System.out.println("Welcome to method calculator");
		add();//this will give the same einput again and again
		sub(20,30);
		sub(50,30);//instaed  of giving the valur directly we can also give like this to use multiple times with differnt value like sub(10,20).
	}
}
