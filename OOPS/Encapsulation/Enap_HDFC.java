import java.util.Scanner;
class Account
{
	//states
	private String userName;
	private long accNo;
	private double balance=1000; //no direct access
	static String IFSC="HDFC001023456";
	private long phoneNo;
	private int pin;
	Account(String userName,long phoneNo,int pin) //we are taking only 3 parameters vecoz bal,ifcs is already assigned and accno is generated  by the bank not by the user
	{
		this.userName=userName;
		this.phoneNo=phoneNo;
		this.pin=pin;
		this.accNo=generateAccno();//assigning tothe method after the generation of the accno
	}
	long generateAccno() //using long datatype because it is returning the value
	{
		long no=(long) (Math.random()*9000000)+1000000;
		return no;
	}
	//getter method for balance
	public double getBalance()
	{
		return balance;
	}
	//setter method for pin
	public void setPin(int pin)
	{
		this.pin=pin;
		System.out.println("pin has updated");
	}
	//getter method for pin
	public int getPin()
	{
		return pin;
	}
	//getter method for userName
	public String getUserName()
	{
		return userName;
	}
	//getter method for phno
	public long getPhoneNo()
	{
		return phoneNo;
	}
	//getter method for accno
	public long getAccNo()
	{
		return accNo;
	}
	//behaivours
	void deposit(double amount)
	{
		balance+=amount;
		System.out.println("deposit done successfully");
	}
	void withdrawal(double amount)
	{
		if(balance>=amount)
		{
			balance -=amount;
			System.out.println("Withdrawal done successfully");
		}
		else
			System.out.println("Insufficient balance");
	}
	
}
class Enap_HDFC 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		//if we are declaraing outside the do means while completing and then again while coming back it will assign new value.
		String userName;
		long phoneNo;
		int pin;
		int option;
		Account a1=null;//otherwise it is giving error so give one value
		double amount;//for deposit purpose
		do
		{
		System.out.println("1.CREATE ACCOUNT \n2.CHECK BALANCE \n3.DEPOSIT \n4.WITHDRAWAL \n5.CHANGE PIN  \n6.DISPLAY DETAILS \n7.EXIT");
		System.out.print("Enter any one option:");
		option=sc.nextInt();
		switch(option)
		{
			case 1:System.out.print("Enter your name:");
				   userName=sc.next();
				   System.out.print("Enter your phone number:");
				   phoneNo=sc.nextLong();
				   System.out.print("Enter your pin:");
				   pin=sc.nextInt();
				   a1=new Account(userName,phoneNo,pin);
				   break;
			case 2:System.out.println(a1.getBalance());
				   break;
			case 3:System.out.print("Enter the deposit amount:");
				   amount=sc.nextDouble();
				   a1.deposit(amount);
				   break;
			case 4:System.out.print("Enter the withdrawal amount:");
				   amount=sc.nextDouble();
				   a1.withdrawal(amount);
				   break;
			case 5:System.out.print("Enter the new pin:");
				   pin=sc.nextInt();
				   a1.setPin(pin);
				   System.out.println("your updated pin is:"+a1.getPin());
				   break;
			case 6:System.out.println("user details");
				   System.out.println(a1.getUserName());
				   System.out.println(a1.getPhoneNo());
				   System.out.println(a1.getAccNo());
				   break;
			case 0:System.out.println("Thank You");
			       break;
				   
		}
		}while(option!=0);
	}
}