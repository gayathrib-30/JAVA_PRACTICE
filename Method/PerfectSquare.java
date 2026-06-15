import java.util.Scanner;

public class PerfectSquare
{
    public static boolean isPSq(int n)
    {
        for(int i = 1; i * i <= n; i++)
        {
            if(i * i == n)
                return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(isPSq(n))
            System.out.println("Perfect Square Number");
        else
            System.out.println("Not a Perfect Square Number");
    }
}