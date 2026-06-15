//leetcode
class ContainerWithMostWater
{
    public static void main(String[] args)
    {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        int n = arr.length;
        int waterLevel = Integer.MIN_VALUE;

        for(int i=0 ; i<n ; i++)
        {
            for(int j=i+1 ; j<n ; j++)
            {
                int h = Math.min(arr[i] , arr[j]);
                int w = j - i ;
                int area = h * w ;
                waterLevel = Math.max(area,waterLevel);
                //System.out.println(area); -->for understaing
            }
        }
        System.out.println(waterLevel);
    }
}