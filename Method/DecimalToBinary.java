class DecimalToBinary
{
    public static int convertDecimal(int n)
    {
        int sum = 0;
        int r = 1;

        while(n > 0)
        {
            int ld = n % 2;
            sum = sum + ld * r;
            n = n / 2;
            r = r * 10;
        }

        return sum;
    }

    public static void main(String[] args)
    {
        int binary = 29;
        int decimal = convertDecimal(binary);

        System.out.println(decimal);
    }
}