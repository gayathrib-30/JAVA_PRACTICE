import java.util.Arrays;
class  InsertionSort
{
	public  void main(String[] args) 
	{
		int a[]={5,2,3,1,4};
		int n=a.length;
		for(int i=1;i<n;i++)
		{
			int key=a[i];
			int j=i-1;
			while(j>=0&&a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		System.out.println(Arrays.toString(a));
	}
}