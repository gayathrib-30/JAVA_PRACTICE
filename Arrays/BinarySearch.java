class BinarySearch
{
    public static int search(int[] nums, int target)
    {
        int i = 0;
        int j = nums.length - 1;

        while(i <= j)
        {
            int mid = i + (j - i) / 2;

            if(nums[mid] == target)
                return mid;
            else if(target > nums[mid])
                i = mid + 1;
            else
                j = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args)
    {
        int nums[] = {2,4,6,8,10,12};
        int target = 8;

        int index = search(nums, target);

        System.out.println("Element found at index: " + index);
    }
}