import java.util.Arrays;

class MergeSort
{
    public static void conquer(int arr[], int start, int mid, int end)
    {
        int i = start;
        int j = mid + 1;
        int merged[] = new int[end - start + 1];

        int k = 0;

        while (i <= mid && j <= end)
        {
            if (arr[i] <= arr[j])
            {
                merged[k] = arr[i];
                k++;
                i++;
            }
            else
            {
                merged[k++] = arr[j++];
            }
        }

        while (i <= mid)
        {
            merged[k++] = arr[i++];
        }

        while (j <= end)
        {
            merged[k++] = arr[j++];
        }

        int n = start;
        for (int m = 0; m < merged.length; m++)
        {
            arr[n] = merged[m];
            n++;
        }
    }

    public static void divide(int[] arr, int start, int end)
    {
        if (start < end)
        {
            int mid = start + (end - start) / 2;
            divide(arr, start, mid);
            divide(arr, mid + 1, end);
            conquer(arr, start, mid, end);
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {6, 5, 4, 3, 2, 1};
        int n = arr.length;

        divide(arr, 0, n - 1);

        System.out.println(Arrays.toString(arr));
    }
}