class FindDuplicate1
{
    public static int findDuplicate(int arr[])
    {
        for(int i=0 ; i<arr.length; i++)
        {
            for(int j=i+1 ; j<arr.length ; j++)
            {
                if(arr[i] == arr[j])
                    return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int arr[] ={2,3,5,10,9,10};
        int duplicate = findDuplicate(arr);
        System.out.println(duplicate);
    }
}