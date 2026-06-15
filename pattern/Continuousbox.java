class Continuousbox
{
	public static void main(String[] args) 
	{
		int n=	5;
		for(int i=0;i<n;i++)
		{
			//box1
			for(int j=0;j<n;j++)
			{
				if(j==0||i==n-1||i+j==n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("  ");//for giving the space
			//box2 again we are printing the same bos in the same line
			for(int j=0;j<n;j++)
			{
				if(i==0||i==j||j==0)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			
			//box3
			for(int j=0;j<n;j++)
			{
				if(i==n-1||i==j||j==n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			//box4
			for(int j=0;j<n;j++)
			{
				if(i==0||j==n-1||i+j==n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}	
	}
}