class HollowSquare2
{
	public static void main(String[] args) throws Exception//because of thread
	{
		int n=	5;
		for(int i=0;i<n;i++)
		{
			//box1
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0||i==n-1||j==n-1){
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				Thread.sleep(50);//undersatnding purpose
			}
			System.out.print("  ");//for giving the space
			//box2 again we are printing the same bos in the same line
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0||i==n-1||j==n-1){
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				Thread.sleep(50);//for understanding purpose
			}
			System.out.println();
		}	
	}
}