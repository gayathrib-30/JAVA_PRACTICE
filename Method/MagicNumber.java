class MagicNumber
{
    public static boolean isMagic(int n)
    {
        while(n > 9)
        {
            int sum = 0;

            while(n > 0)
            {
                int ld = n % 10;
                sum = sum + ld;
                n = n / 10;
            }

            n = sum;
        }

        if(n == 1)
            return true;

        return false;
    }

    public static void main(String[] args)
    {
        int n = 289;
        boolean ans = isMagic(n);
        System.out.println(ans);
    }
}