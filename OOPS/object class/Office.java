class Emp
{
	String ename;
	int eid;
	Emp(String ename,int eid)
	{
		this.ename=ename;
		this.eid=eid;
	}
}
class Office 
{
	public static void main(String[] args) 
	{
		Emp e1=new Emp("miller",101);
		Emp e2=new Emp("scott",102);
		System.out.println(e1);
		System.out.println(e1.toString()); //it is used to create one address by the tostring methos ,this is not the original address
		System.out.println(e1.ename);

	}
		
}
