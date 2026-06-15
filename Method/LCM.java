class LCM
{
    public static int findLCM(int a, int b)
    {
        int max = Math.max(a, b);
        int i = 1;

        while(true)
        {
            int current = max * i;

            if(current % a == 0 && current % b == 0)
                return current;

            i++;
        }
    }

    public static void main(String[] args)
    {
        int a = 2;
        int b = 3;

        int lcm = findLCM(a, b);
        System.out.println("lcm is : " + lcm);
    }
}