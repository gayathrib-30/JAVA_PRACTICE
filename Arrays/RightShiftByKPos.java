import java.util.Arrays;
class RightShiftBykPos //n number of times we have to right shift
{
    public static void main(String[] args)
    {
        int a[] = {10,20,30,40,50};
        int n = a.length;
		int k=7;
		k=k%n;//because we non need to run for 7 times instaed we run it for 2 times becoz the array size is 5 when we are running it for 5 times(i.e k=5) we will get the same array,similarly while we are doing it for the 7th time we will get op for the 2nd time itself (i.e k=2). and aslo for optimization we are doing this without doing this also we will get the op
		for(int j=1;j<=k;j++)
		{
        int last = a[n-1];

        for(int i=n-2 ; i>=0 ; i--)
        {
            a[i+1] = a[i];
        }
        a[0] = last;
		}
        System.out.println(Arrays.toString(a));
    }
}