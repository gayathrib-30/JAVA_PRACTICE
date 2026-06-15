class Father
{
	double money=1000;
	String scooty="Activa";

}
class Daughter extends Father
{
	String phone="iphone";
	boolean hasBf=true;
}

class SingleLevel
{
	public static void main(String[] args) 
	{
		Daughter d=new Daughter();  
		System.out.println(d.phone);
		System.out.println(d.hasBf);
		System.out.println(d.money);
		System.out.println(d.scooty);
		//it is possible
		Father f=new Father();
		System.out.println(f.money);
		System.out.println(f.scooty);
		//it is not possible---cannot able to acquire the properties of daughter from father by using the fathers object
		//System.out.println(f.phone);
		//System.out.println(f.hasBf);
	}
}
