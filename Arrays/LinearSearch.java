class LinearSearch
{
    public static int linearSearch(int[] arr, int key)
    {
        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args)
    {

        int arr[] ={5,10,2,8,9,7};
        int key = 70 ;
        int index = linearSearch(arr,key);
        System.out.println(index);

    }
}