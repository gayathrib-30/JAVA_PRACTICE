import java.util.*;
class Ride
{
	String Pickup;
	String Drop;
	int Distance;
	String Drivers[]={"dhoni","virat","rinku","jaddu","hardik"};
	int index=generateIndex();
	String driver=Drivers[index];
	Ride(String Pickup,String Drop,int Distance)
	{
		this.Pickup=Pickup;
		this.Drop=Drop;
		this.Distance=Distance;
	}
	int  generateIndex()
	{
		int index=(int)(Math.random()*10);
		return index;
	}
}
class Car extends Ride //in this we are using the car constructor because in the parent class we have given the constructor so in the car class we are calling the super caling statement
{
	int price=50;
	Car(String Pickup,String Drop,int Distance)
	{
		super(Pickup,Drop,Distance);
	}
	void CarDetails()
	{
		System.out.println("Your Car Ride Details");
		System.out.println("Pickup is:"+Pickup);
		System.out.println("Drop is:"+Drop);
		System.out.println("Distance is:"+Distance+"km");
		System.out.println("total price :"+(price*Distance));
		System.out.println("Your Driver is:"+driver);
	}
	
}
class Bike extends Ride 
{
	int price=20;
	Bike(String Pickup,String Drop,int Distance)
	{
		super(Pickup,Drop,Distance);
	}
	void BikeDetails()
	{
		System.out.println("Your Bike Ride Details");
		System.out.println("Pickup is:"+Pickup);
		System.out.println("Drop is:"+Drop);
		System.out.println("Distance is:"+Distance+"km");
		System.out.println("total price :"+(price*Distance));
		System.out.println("Your Driver is:"+driver);
	}
	
}
class Auto extends Ride 
{
	int price=30;
	Auto(String Pickup,String Drop,int Distance)
	{
		super(Pickup,Drop,Distance);
	}
	void AutoDetails()
	{
		System.out.println("Your Auto Ride Details");
		System.out.println("Pickup is:"+Pickup);
		System.out.println("Drop is:"+Drop);
		System.out.println("Distance is:"+Distance+"km");
		System.out.println("total price :"+(price*Distance));
		System.out.println("Your Driver is:"+driver);
	}
	
}

class Rapido 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("1.Auto \n2.Bike \n3.Car");
		System.out.print("Enter any one option:");
		int option=sc.nextInt();
		String Pickup;
		String Drop;
		int Distance;
		Ride r=null; //parent class reference variable for auto,bike and car to create the object--upcsating part
		switch(option)
		{
			case 1:
				System.out.print("Enter your Pickup Location:");
				Pickup=sc.next();
				System.out.print("Enter your Drop Location:");
				Drop=sc.next();
				System.out.print("Enter The Distance:");
				Distance=sc.nextInt();
				r=new Auto(Pickup,Drop,Distance);
				break;
			case 2:
				System.out.print("Enter your Pickup Location:");
				Pickup=sc.next();
				System.out.print("Enter your Drop Location:");
				Drop=sc.next();
				System.out.print("Enter The Distance:");
				Distance=sc.nextInt();
				r=new Bike(Pickup,Drop,Distance);
				break;
			case 3:
				System.out.print("Enter your Pickup Location:");
				Pickup=sc.next();
				System.out.print("Enter your Drop Location:");
				Drop=sc.next();
				System.out.print("Enter The Distance:");
				Distance=sc.nextInt();
				r=new Car(Pickup,Drop,Distance);
				break;
			default:System.out.println("INVALID OPTION");
		}
		if(r instanceof Auto)
		{
			Auto a=(Auto) r;
			a.AutoDetails();
		}
		if (r instanceof Bike)
		{
			Bike b=(Bike) r;
			b.BikeDetails();;
		}
		if(r instanceof Car)
		{
			Car c=(Car) r;
			c.CarDetails();
		}
	}
}
