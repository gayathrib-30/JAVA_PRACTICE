interface Student
{
	void study();
}
public class Practice 
{
	public static void main(String[] args) 
	{
		/*class Boy implements Student
		{
			@Override
				public void study()
				{
					System.out.println("Student is studying");
				}
		}
		//writing any class inside the method is called is "METHOD LOCAL INNER CLASS"
		Boy b1=new Boy();
		b1.study();*/
		
		//anonymous name
		
		/*Student stu=new Student(){
			@Override
			public void study()
				{
					System.out.println("Student is studying");
				}
		};
		stu.study();*/
		
		//lambda expression
		Student stu1=()->{
			System.out.println("Student is studying");
		};
		stu1.study();
		
	}
}
