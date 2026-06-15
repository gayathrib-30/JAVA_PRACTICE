//for understaing refer the pairs program that is print all pairs from thr array
class MaxSumPair
{
    public static void main(String[] args)
    {
        int a[] = {1,2,3,4,5};
        int n = a.length;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0 ; i<n ; i++)
        {
            int sum = 0 ;
            for(int j=i+1 ; j<n ; j++)
            {
                sum = a[i] + a[j];
                maxSum = Math.max(sum,maxSum);
                System.out.println(sum);
            }
        }

        System.out.println("maximum sum pair is : " + maxSum);
    }
}