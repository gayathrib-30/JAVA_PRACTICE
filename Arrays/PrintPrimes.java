class PrintPrimes
{
    public static boolean isPrime(int num)
    {
        int count = 0 ;

        for(int i=1 ; i<= num ; i++)
        {
            if(num % i == 0)
                count++;
        }
        return count==2;
    }

    public static void main(String[] args)
    {
        int arr[] ={5,10,7,9,13,18};

        for(int i=0 ; i<arr.length;i++)
        {
            if( isPrime(arr[i]) )
            {
                System.out.println(arr[i]);
            }
        }

    }
}