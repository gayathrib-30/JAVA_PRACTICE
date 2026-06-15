class GCD
{
    public static int findGcd(int a , int b)
    {
        int gcd = 1;
        int n = Math.min(a,b);//when we don't know which is the maximum value ,

        for(int i = 1 ; i <= n ; i++)//we can take directly a or b but for the code optimization we are finding the minimum val ,why becoz in any two no the upto min it will take the factors 
        {
            if(a % i == 0 && b % i == 0)
                gcd = i;
        }

        return gcd;
    }

    public static void main(String[] args)
    {
        int gcd = findGcd(10,100);
        System.out.println("GCD is : " + gcd);
    }
}