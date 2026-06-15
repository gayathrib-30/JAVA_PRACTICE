class SingleNumber
{
    public static void main(String[] args)
    {
        int arr[] ={1,2,3,1,3,2,4};

        int ans = 0 ;

        for(int i=0 ; i<arr.length; i++)
        {
            ans = ans ^ arr[i];
        }
        System.out.println("single number is : "+ans);
    }
}