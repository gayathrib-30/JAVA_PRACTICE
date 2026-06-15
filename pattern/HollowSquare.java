class HollowSquare 
{
	public static void main(String[] args) throws Exception //while using the thread
	{
		int n=	5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0||i==n-1||j==n-1)//which row we need to print ,if thta row/col contains the similar number and also n-1 is 4 when n=5,because i starts from 0
				{
					System.out.print("* ");//here iam giving # and space means 2 character to come in the clear manner
				}
				else
				{
					System.out.print("  ");//similary i have to two spaces for that otherwise it won't work	
				}
				Thread.sleep(100);//it will give the o/p in sow manner and is not mandatory
			}
			System.out.println();
		}	
	}
}
