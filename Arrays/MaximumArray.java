class MaximumArray
{
    public static void main(String[] args)
    {
        int arr[] = {10, 25, 5, 80, 30};

        int max = Integer.MIN_VALUE;
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        System.out.println("Maximum element is: " + max);
    }
}