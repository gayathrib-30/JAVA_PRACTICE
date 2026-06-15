interface calculate
{
	void add();
}

class Caluculator 
{
	public static void main(String[] args) 
	{
		/*class A implements calculate
		{
			@Override
				public void add()
			{
				System.out.println("i am add method");
			}
		}
		calculate c=new A();
		c.add();*/
		
		//Anonymous class
		calculate c=new calculate(){
			@Override
				public void add()
			{
				System.out.println("i am add method");
			}
		};
		c.add();
	}
}
