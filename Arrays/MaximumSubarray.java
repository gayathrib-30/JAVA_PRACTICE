//THIS IS NOT THE OPTIMIZED WAY INSTEAD USE KEDANES ALGORITHM-->PROGRAM
class MaximumSubarray
{
    public static void main(String[] args)
    {
        int a[] = {-2,1,-3,4,-1,2,1,-5,4};
        int n = a.length;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0 ; i<n ; i++)
        {
            for(int j=i ; j<n ; j++)
            {
                int sum = 0 ;
                for(int k=i ; k<=j ; k++)
                {
                    //System.out.print(a[k] + " ");
                    sum = sum + a[k];
                    maxSum = Math.max(sum , maxSum);
                }
                //System.out.println(" sum is : " + sum); //FOR UNDERSTANDING
            }
        }

        System.out.println("maximum sum subarray is : " + maxSum);
    }
}