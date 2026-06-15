//common elements b/w two sorted array
class CommonElemnetbw_2
{
    public static void main(String[] args)
    {
        int a[] = {2,5,8,10,12};
        int b[] = {3,6,8,9,12,15};
        int i=0 , j = 0 ;
        
        while(i<a.length && j<b.length)
        {
            if(a[i] == b[j])
            {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
            else if(a[i] < b[j])
                i++;
            else
                j++;
        }
    }
}