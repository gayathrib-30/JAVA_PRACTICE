class SmalltoCapital 
{
	public static void main(String[] args) 
	{
		String s="JaVaScRiPt";
		String str="";
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch>=97&&ch<=122)
				ch-=32;
			else if(ch>=65&&ch<=90)
				ch+=32;
			str+=ch;
		
		}
		System.out.println("Original String:"+s);
		System.out.println("After Changing :"+str);
	}
}
