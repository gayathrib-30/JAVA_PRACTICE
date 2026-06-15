//leetcode-->55
import java.util.Arrays;
class JumpGame 
{
	public static boolean CanJump(int[] a)
	{
		int n=a.length;
		int destination=n-1;
		for(int i=n-2;i>=0;i--)
		{
			if(a[i]+i>=destination)
				destination=i;
		}
		return destination==0;
	}
	public static void main(String[] args) 
	{
		int a[]={2,3,1,1,4};
		System.out.println(CanJump(a));
	}
}
