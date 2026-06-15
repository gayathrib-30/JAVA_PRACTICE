import java.util.*;
class Emp
{
 String ename;
 int eid;
 double sal;
 private String dept;
 
 Emp(String ename, int eid, double sal,String dept)
 {
  this.ename = ename;
  this.eid = eid;
  this.sal = sal;
  this.dept = dept;
 }
 //setter method
 
 public void setDept(String dept)
	{
		this.dept=dept;
	}
	
 void empDetails()
 {
  System.out.println(ename);
  System.out.println(eid);
  System.out.println(sal);
  System.out.println(dept);
 }
}

class Developer extends Emp
{
 
 String skills[] = new String[4];
 Developer(String ename,int eid,double sal,String dept,String[] skills)
 {
  super(ename,eid,sal,dept);
  
  for(int i=0 ; i<skills.length;i++)
  {
   this.skills[i] =   skills[i];
  }
 }
 @Override
	 void empDetails()
	{
	 System.out.println("DEVELOPERS DETAILS:");
		super.empDetails();
		System.out.println(Arrays.toString(skills));
	}
}

class TestEngineer extends Emp
{
  String tools[]=new String[4];
  TestEngineer(String ename, int eid,double sal,String dept,String[] tools){
    super(ename,eid,sal,dept);
    for(int i=0;i<tools.length;i++){
      this.tools[i]=tools[i];
    }
  }
 @Override
	 void empDetails()
	{
	 System.out.println("TEST ENGINEERS DETAILS:");
		super.empDetails();
		System.out.println(Arrays.toString(tools));
	}
}

class EMS 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
 {
	int option,eid;
	String ename,dept;
	double sal;
	String skills[]=new String[4];
	String tools[]=new String[4];
	Emp e1=null;
	do
	{
		System.out.println("1.Create Developer Account");
		System.out.println("2.Create TestEngineer Account");
		System.out.println("3.Dispaly Developers Details");
		System.out.println("4.Dispaly TestEngineer Details");
		System.out.println("5.Change Department");
		System.out.println("0.Exit");
		System.out.print("ENTER ANY ONE OPTION:");
		option=sc.nextInt();
		switch(option)
		{
			case 1:
				System.out.print("Enter your Name:");
				ename=sc.next();
				System.out.print("Enter your ID:");
				eid=sc.nextInt();
				System.out.print("Enter your Salary:");
				sal=sc.nextDouble();
				System.out.print("Enter your Department:");
				dept=sc.next();
				System.out.print("Enter your skills:");
				for(int i=0;i<4;i++)
				{
					skills[i]=sc.next();
				}
				e1=new Developer(ename,eid,sal,dept,skills);
				System.out.println("YOUR ACCOUNT IS CREATED");
				e1.empDetails();
				break;
			case 2:
				System.out.print("Enter your Name:");
				ename=sc.next();
				System.out.print("Enter your ID:");
				eid=sc.nextInt();
				System.out.print("Enter your Salary:");
				sal=sc.nextDouble();
				System.out.print("Enter your Department:");
				dept=sc.next();
				System.out.print("Enter your tools:");
				for(int i=0;i<4;i++)
				{
					tools[i]=sc.next();
				}
				e1=new TestEngineer(ename,eid,sal,dept,tools);
				System.out.println("YOUR ACCOUNT IS CREATED");
				e1.empDetails();
				break;	
			case 0:System.out.println("THANK YOU!...");
			}
	}
	while (option!=0);
	
 }
}