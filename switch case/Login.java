import java.util.Scanner;
class Login 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception //because of giving the thread function we are using this exception
	{
		System.out.println("\t\t\tWELCOME TO MY APPLICATION");
		long regphno=9876543210L;
		System.out.print("Enter the phone number:");
		long userphno=sc.nextLong();
		System.out.println("\t\t\tPROCESSING......");
		Thread.sleep(2000);//it will make the execution to wait for 2 seconds,1000--1sec
		if(regphno==userphno)
		{
			int generatedotp=(int)(Math.random()*9000)+1000;
			System.out.println("\t\tyour otp is:"+generatedotp);
			System.out.print("Enter the opt:");
			int userotp=sc.nextInt();
			System.out.println("\t\t\tPROCESSING......");
			Thread.sleep(2000);
			if(generatedotp==userotp){
				System.out.println("\t\tLOGIN DONE SUCCESSFULLY");
			}
			else{
				System.out.println("\t\tINVALID OTP");
			}
		}
		else{
			System.out.println("\t\tWRONG CREDENTIALS");
			
			}
		}
	}

