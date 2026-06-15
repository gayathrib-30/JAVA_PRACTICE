class XylemNumber
{
    public static void main(String[] args)
    {
        int n = 12416;

        int lastDigit = n % 10;   
        n = n / 10;               

        int sum = 0;
        while(n > 9)
        {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }

        int sum2 = lastDigit + n;

        System.out.println(sum);
        System.out.println(sum2);

        if(sum == sum2)
            System.out.println("it is xylem number");
        else
            System.out.println("it is Phloem number");
    }
}