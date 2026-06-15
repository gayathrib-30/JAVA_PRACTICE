class MinimumArray
{
    public static void main(String[] args)
    {
        int arr[] = {10, 25, 5, 80, 30};

        int min = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }

        System.out.println(min);
    }
}