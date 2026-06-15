//only retuning true or false not the index-->does not support leetcode ans
class TwoSum
{
    public static boolean twosum(int[] arr,int target)
    {
        for(int i=0 ; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length;j++)
            {
                if(arr[i] + arr[j] == target)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        int arr[] = {4,6,5,2};
        int target = 12 ;

        boolean ans = twosum(arr,target);
        System.out.println(ans);
    }
}