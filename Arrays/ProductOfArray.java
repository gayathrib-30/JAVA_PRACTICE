//leetcode
//product of array except itself
import java.util.Arrays;
class ProductOfArray
{
    public static void main(String[] args)
    {

        int arr[] = {1,2,3,4};
        int n = arr.length;

        int pre[] = new int[n];
        int suf[] = new int[n];
        int ans[] = new int[n];
        pre[0] = 1;//because there is no value present before prefix[0]
        suf[n-1] = 1;//because there is no value present before suffix[n-1]
        for(int i=1 ; i<n ; i++)
        {
            pre[i] = pre[i-1] * arr[i-1];
        }

        for(int i=n-2 ; i>=0 ; i--)
        {
            suf[i] = suf[i+1] * arr[i+1];
        }

        for(int i=0 ; i<n ; i++)
        {
            ans[i] = pre[i] * suf[i];
        }

        System.out.println("orgnl array : "+Arrays.toString(arr));
        System.out.println("prfix array : "+Arrays.toString(pre));
        System.out.println("suffix array: "+Arrays.toString(suf));
        System.out.println("answer array: "+Arrays.toString(ans));
    }
}