class Handle5 
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		int a=30,b=0;
		try{
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a/b);
		}
		catch(Exception e){
			System.out.println("Exception is handled");
		}
		finally{
			System.out.println("I am Finally bliock");
		}
		System.out.println("End");
	}
}
