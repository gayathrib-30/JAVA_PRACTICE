class User
{
	String userName;
	String userId;
	private long Phno;
	User(String userName,String userId,long Phno){
		this.userName=userName;
		this.userId=userId;
		this.Phno=Phno;
	}
	//setter method
	public void setPhno(long Phno){
		this.Phno=Phno;
	}
	//getter method
	public long getPhno(){
		return Phno;
	}
	void userDetails()
	{
		System.out.println("-----USER DETAILS-----");
		System.out.println("User Name is:"+userName);
		System.out.println("User ID is:"+userId);
		//System.out.println("User Phno is:+"Phno);
	}
}
class Product
{
	String ProductName;
	String pid;
	double price;
	Product(String ProductName,String pid,double price)
	{
		this.ProductName= ProductName;
		this.pid=pid;
		this.price=price;
	}
	void ProductDetails()
	{
		System.out.println("-----PRODUCT DETAILS-----");
		System.out.println("Product Name is:"+ProductName);
		System.out.println("Product Id is:"+pid);
		System.out.println("Product price is:"+price);
	}
}
interface Payment
{
	void pay(double amount);
}
class Cash implements Payment
{
	@Override
		public void pay(double amount){
			System.out.println("Payement"+amount+"Rs done by Cash");
		}
}
class Upi implements Payment
{
	@Override
		public void pay(double amount){
			System.out.println("Payement"+amount+"Rs done by Upi");
		}
}
class Card implements Payment
{
	@Override
		public void pay(double amount){
			System.out.println("Payement"+amount+"Rs done by Card");
		}
}
class Ecommerce 
{
	static{
		System.out.println("\t\t\tWELCOME TO ECOMMERCE APPLICATION");
	}
	public static void main(String[] args) 
	{
		User u1=new User("Geetha","user123",12345678);
		u1.userDetails();
		Product p1=new Product("laptop","product1",60000.0);
		Product p2=new Product("camera","product2",15000.0);
		Product p3=new Product("mobile","product3",45000.0);
		Product products[]=new Product[3];
		products[0]=p1;
		products[1]=p2;
		products[2]=p3;
		//traversing part
		for(Product p:products)
		{
			p.ProductDetails();
		}
			
	}
}
