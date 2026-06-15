class Automorphic
{
    public static boolean isAutomorphic(int n)
    {
        int sq = n * n;

        while(n > 0)
        {
            int ld1 = n % 10;
            int ld2 = sq % 10;

            if(ld1 != ld2)
                return false;

            n = n / 10;
            sq = sq / 10;
        }

        return true;
    }

    public static void main(String[] args)
    {
        int n = 75;
        boolean ans = isAutomorphic(n);
        System.out.println(ans);
    }
}