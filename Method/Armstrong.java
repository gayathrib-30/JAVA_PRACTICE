import java.util.Scanner;

public class Armstrong
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int temp = n;

        int count = countDigits(n);

        while(n != 0)
        {
            int k = n % 10;
            sum = sum + power(k, count);
            n = n / 10;
        }

        if(temp == sum)
            System.out.print("ARMSTRONG NUM");
        else
            System.out.println("NOT AN ARMSTRONG NUM");
    }

    public static int countDigits(int n)
    {
        int c = 0;
        while(n > 0)
        {
            c++;
            n = n / 10;
        }
        return c;
    }

    public static int power(int b, int p)
    {
        int mul = 1;
        for(int i = 1; i <= p; i++)
        {
            mul = mul * b;
        }
        return mul;
    }
}