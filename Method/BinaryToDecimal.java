class BinaryToDecimal
{
    public static int convertDecimal(int n)
    {
        int sum = 0;
        int r = 1;

        while(n > 0)
        {
            int ld = n % 10;
            sum = sum + ld * r;
            n = n / 10;
            r = r * 2;
        }

        return sum;
    }

    public static void main(String[] args)
    {
        int binary = 1111;
        int decimal = convertDecimal(binary);

        System.out.println(decimal);
    }
}