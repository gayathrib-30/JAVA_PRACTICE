import java.util.Scanner;
class SwiggyApp
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("\t\t\tWELCOME TO SWIGGY APPLICATION");
		System.out.println("1.SS Hyderabad \n2.A2B \n3.Pandiyas");
		System.out.println("Enter any one option:");
		int option=sc.nextInt();
		switch(option){
			case 1:
			System.out.println("Welcome to SS Hyderabad");
			System.out.println("our menu card is:");
			System.out.println("1.chicken biriyani 200rs \n2.mutton briyani 300 rs \n3.ghee roast 60rs");
			System.out.print("select any one food:");
			int food=sc.nextInt();
			System.out.println("enter the quantity");
			int quantity=sc.nextInt();
			int bill=0;
			if(food==1){
				bill=200*quantity;
			}
			else if(food==2){
				bill=300*quantity;
			}
			else if(food==3){
				bill=60*quantity;
			}
			else{
				System.out.println("Enter the correct option");
			}
			System.out.println("your bill is:"+bill);
			System.out.println("if you want to pay type y or n:");
			char ch=sc.next().charAt(0);
			if(ch=='Y'||ch=='y'){
				System.out.println("enter the amount:");
				int amount=sc.nextInt();
				if(amount==bill){
					System.out.println("order is placed");
				}
				else{
					System.out.println("order is delayed");
				}
			}
			else{
				System.out.println("payment cancelled");
			}
			break;
			case 2:System.out.println("welcome to a2b");
			break;
			case 3:System.out.println("welcome to pandiyas");
			break;
			default:
				System.out.println("invalid");
		}
		
	}
}
