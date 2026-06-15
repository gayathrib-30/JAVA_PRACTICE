//less complexity the find duplicate1
import java.util.Arrays;
class FindDuplicate2
{
    public static int findDuplicate(int arr[])
    {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for(int i=0 ; i<arr.length-1 ; i++)
        {
            if(arr[i] == arr[i+1])
                return arr[i];
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int arr[] ={2,5,3,10,9,10};
        int duplicate = findDuplicate(arr);
        System.out.println(duplicate);
    }
}