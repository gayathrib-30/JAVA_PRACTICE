import java.util.Arrays;

class MoveNegativesToStart 
{
    public static void main(String[] args) 
    {
        int a[] = {10,5,-2,-5,8,-7,6};

        int i = 0;
        int j = a.length - 1;

        while(i < j)
        {
            if(a[i] >= 0 && a[j] >= 0)
                j--;

            else if(a[i] < 0 && a[j] < 0)
                i++;

            else if(a[i] < 0 && a[j] >= 0)
            {
                i++;
                j--;
            }

            else
            {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
                i++;
                j--;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}