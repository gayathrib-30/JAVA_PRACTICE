class BreakNotWorking extends RuntimeException
{
	BreakNotWorking(String msg)
	{
		super(msg);
	}
}
class Bike
{
	static boolean isStoppable=false;
	public static void ride()
	{
		System.out.println("Bike is running");
		if(isStoppable)
			System.out.println("Bike is stopped");
		else
			throw new BreakNotWorking("You Can't stop");
	}
}
class  Custom2_UnChecked 
{
	public static void main(String[] args) 
	{
		try{
			Bike.ride();
		} 
		catch(BreakNotWorking b)
		{
			System.out.println("Exception is handled");
			System.out.println(b.getMessage());
		}
	}
}
