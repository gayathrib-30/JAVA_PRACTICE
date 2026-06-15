class MaxDigit
{
    public static int maxDigit(int n)
    {
        int maxdigit = Integer.MIN_VALUE;

        while(n > 0)
        {
            int ld = n % 10;
            maxdigit = Math.max(maxdigit, ld);
            n = n / 10;
        }

        return maxdigit;
    }

    public static void main(String[] args)
    {
        int n = 25374912;
        System.out.println(maxDigit(n));
    }
}