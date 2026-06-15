//leetcode
import java.util.Arrays;
class MoveZeros 
{
	public static void main(String[] args) 
	{
		int a[]={1,0,3,0,12};
		int i=0;
		int j=0;
		int n=a.length;
		while(j<n)
		{
			if(a[j]==0)
			{
				j++;
			}
			else
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j++;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
