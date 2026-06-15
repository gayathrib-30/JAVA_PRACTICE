import java.util.Scanner;
import java.util.Arrays;
class UserData
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int arr[] = new int[5];
        System.out.println("enter array data");

        for(int i=0 ; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("array is ");
        System.out.println(Arrays.toString(arr));
    }
}