import java.util.Scanner;

class DoWhile_Bank
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception
    {
        int option;
        int balance = 1000;
        int pin = 1430;
        long phNo = 1234567890L;

        do
        {
            System.out.println("1.Display Balance \n2.Deposit \n3.Withdrawl \n4.Change Pin \n5.Exit");
            System.out.print("enter one option : ");
            option = sc.nextInt();

            switch(option)
            {
                case 1 :
                    System.out.println("your balance is : " + balance);
                    break;

                case 2 :
                    System.out.print("enter the amount : ");
                    int amount = sc.nextInt();
                    balance = balance + amount;
                    System.out.println("deposit done successfully");
                    break;

                case 3 :
                    System.out.print("enter the amount : ");
                    int withdrawl = sc.nextInt();

                    System.out.print("enter your pin : ");
                    int userPin = sc.nextInt();

                    System.out.println("processing....");
                    Thread.sleep(2000);

                    if(userPin == pin)
                    {
                        if(withdrawl <= balance)
                        {
                            balance = balance - withdrawl;
                            System.out.println("withdrawl done");
                        }
                        else
                        {
                            System.out.println("you poor .. get lost!!");
                        }
                    }
                    else
                    {
                        System.out.println("wrong pin");
                    }
                    break;

                case 4 :
                    System.out.print("enter your phone number: ");
                    long userPh = sc.nextLong();

                    System.out.println("checking phone number.....");
                    Thread.sleep(2000);

                    if(userPh == phNo)
                    {
                        int otp = (int)(Math.random()*9000)+1000;
                        System.out.println("your otp is : " + otp);

                        System.out.print("enter your otp : ");
                        int userOtp = sc.nextInt();

                        System.out.println("checking otp....");
                        Thread.sleep(2000);

                        if(otp == userOtp)
                        {
                            System.out.print("enter your new pin : ");
                            pin = sc.nextInt();
                            System.out.println("pin updated successfully");
                        }
                        else
                        {
                            System.out.println("invalid otp");
                        }
                    }
                    else
                    {
                        System.out.println("invalid number");
                    }
                    break;

                case 5 :
                    System.out.println("tata bye bye, go safe");
                    break;

                default :
                    System.out.println("select correct option");
            }

        } while(option != 5);
    }
}