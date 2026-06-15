class MissingNumber
{
    public static void main(String[] args)
    {
        int n = 5 ;
        int arr[] = {4,1,2,3} ;
        int expectedSum = ( n * (n+1)) / 2 ;
        int sum = 0;
        for(int i=0 ; i<arr.length; i++)
        {
            sum = sum + arr[i];
        }
        int missing = expectedSum - sum ;
        System.out.println("expected sum is : "+expectedSum);
        System.out.println("sum is : "+sum);
        System.out.println("missing number is : "+missing);
    }
}