import java.util.Scanner;
class Qtalk 
{
	String username;
	String email;
	int pass; //pass--password
	long phno;
	Qtalk(String username,String email,int pass,long phno)
	{
		this.username=username;
		this.email=email;
		this.pass=pass;
		this.phno=phno;
	}
	void userDetails()
	{
		System.out.println("User Name is:"+username);
		System.out.println("Email is:"+email);
		System.out.println("password is:"+pass);
		System.out.println("Phone Number is:"+phno);
	}
	void login(long phno,int pass)
	{ 
		if(this.phno==phno && this.pass==pass)
			System.out.println("\t\tLOGIN DONE SUCESSFULLY");
		else
			System.out.println("\t\tWRONG CREDENTIALS");
	}
	void login(String email,int pass)
	{ 
		if(this.email.equals(email) && this.pass==pass) //for string here we are using .equals operation to compare the value,if we are given this.email==email means it is showing error.
			System.out.println("\t\tLOGIN DONE SUCESSFULLY");
		else
			System.out.println("\t\tWRONG CREDENTIALS");
	}

	static
	{
		System.out.println("WELCOME TO QTALK APPLICATION");
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int option;
		Qtalk user1=null;
		String loginEmail;
		int loginPass;
		long loginPhno;
		do
		{
		System.out.println("1.Signup \n2.Login By Phone Number \n3.Login By Email \n0.EXIT");
		System.out.print("ENTER ANY ONE OPTION:");
		option=sc.nextInt();
		switch(option)
		{
			case 1:System.out.print("enter your name:");
				   String signupName=sc.next();
				   System.out.print("enter your email:");
				   String signupEmail=sc.next();
				   System.out.print("enter your password:");
				   int signupPass=sc.nextInt();
				   System.out.print("enter your Phone number:");
				   long signupphno=sc.nextLong();
				   user1=new Qtalk(signupName,signupEmail,signupPass,signupphno);
				   System.out.println("\t\tSIGN UP DONE SUCCESSFULLY");
				   break;
			case 2:System.out.print("enter your phone number:");
				   loginPhno=sc.nextLong();
				   System.out.print("enter your password:");
				   loginPass=sc.nextInt();
				   user1.login(loginPhno,loginPass);
				   break;
			case 3:System.out.print("enter your email:");
				   loginEmail=sc.next();
				   System.out.print("enter your password:");
				   loginPass=sc.nextInt();
				   user1.login(loginEmail,loginPass);
				   break;
			case 0:System.out.println("\t\tTHANK YOU!SEE YOU AGAIN..");
				   break;
			default:System.out.println("wrong data provided");
		}
		}
		while(option!=0);
	}
}
