import java.util.Arrays;
class LeftShiftBykPos
{
    public static void main(String[] args)
    {
        int a[] = {10,20,30,40,50};
        int n = a.length;
        int k = 7;

        k = k % n;

        for(int j = 1; j <= k; j++)
        {
            int first = a[0];

            for(int i = 1; i < n; i++)
            {
                a[i - 1] = a[i];
            }

            a[n - 1] = first;
        }

        System.out.println(Arrays.toString(a));
    }
}