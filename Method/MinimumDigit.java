class MinimumDigit
{
    public static int findMin(int n)
    {
        int minimum = Integer.MAX_VALUE;

        while(n > 0)
        {
            int ld = n % 10;
            minimum = Math.min(minimum, ld);
            n = n / 10;
        }

        return minimum;
    }

    public static void main(String[] args)
    {
        int n = 4530126;
        System.out.println(findMin(n));
    }
}