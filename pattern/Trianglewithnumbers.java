class Trianglewithnumbers 
{
	public static void main(String[] args) 
	{
		int n=5;
		int k=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j)
					System.out.print(k++ +" ");//we can use i+1 or j+1 or i for the diff o/p
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
