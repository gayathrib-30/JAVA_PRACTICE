import java.util.*;
class Duck
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER A NUMBER: ");
        int a = sc.nextInt();

        boolean ans = isDuck(a);

        if(ans)
            System.out.println("ITS A DUCK NUMBER");
        else
            System.out.println("NOT A DUCK NUMBER");
    }

    public static boolean isDuck(int n)
    {
        while(n > 0)
        {
            int k = n % 10;

            if(k == 0)
                return true;

            n = n / 10;
        }
        return false;
    }
}