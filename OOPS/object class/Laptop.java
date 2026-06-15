public class Laptop
{
	String brand;
	double price;
	String color;
	Laptop(String brand,double price,String color){
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	@Override
		//though it will give the error but in the op we can see the msg but befor deleting it will execute one time
		protected void finalize()
		{
		System.out.println("element deleted");
	    }

	public static void main(String[] args) 
	{
		Laptop l1=new Laptop("hp",70000,"grey");
		System.out.println(l1.brand);
		System.out.println(l1.color);
		System.out.println(l1.price);
		l1=null;
		System.gc(); //internally it will call the finalize method	and after this we can not able to assign the value for l1.
	}
}

