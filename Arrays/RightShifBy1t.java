import java.util.Arrays;
class RightShiftBy1
{
    public static void main(String[] args)
    {
        int a[] = {10,20,30,40,50};
        int n = a.length;
        int last = a[n-1];

        for(int i=n-2 ; i>=0 ; i--)
        {
            a[i+1] = a[i];
        }
        a[0] = last;
        System.out.println(Arrays.toString(a));
    }
}