class ExtractNumbers
{
	public static void main(String[] args) 
	{
		String s="j5a9v6a";
		int sum=0;
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9')
				sum=sum+ch-48;//since the ascii value of 0 is 48
		}
		System.out.println(sum);
	}
}
