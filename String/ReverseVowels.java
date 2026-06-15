class ReverseVowels 
{
	public static boolean isvowel(char ch){
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			return true;
		return false;
	}
	public static void main(String[] args) 
	{
		char a[]={'l','e','e','t','c','o','d','e'};
		int start=0;
		int end=a.length-1;
		while(start<end){
			if(!isvowel(a[start]))
				start++;
			else if(!isvowel(a[end]))
				end--;
			else
			{
				char temp=a[start];
				a[start]=a[end];
				a[end]=temp;
				start++;
				end--;
			}
		}
		System.out.println(new String(a));
	}
}
