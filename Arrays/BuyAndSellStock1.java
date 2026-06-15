//leetcode
//contains both optimised way and normal way for understanding(inside comment)
class BuyAndSellStock1 
{
    public static void main(String[] args)
    {
        int a[] = {7,1,5,3,6,4};
        int n = a.length,maxProfit = 0 , min=Integer.MAX_VALUE;

        /*
        for(int i=0 ; i<n-1 ; i++)
        {
            for(int j=i+1 ; j<n ; j++)
            {
                int profit = a[j] - a[i];
                maxProfit = Math.max(profit,maxProfit);
                //System.out.println(profit);
            }
        }
        */

        for(int i=0 ; i<n ; i++)
        {
            min = Math.min(min,a[i]);
            int p = a[i] - min ;
            maxProfit = Math.max(p,maxProfit);
        }
        System.out.println(maxProfit);
    }
}