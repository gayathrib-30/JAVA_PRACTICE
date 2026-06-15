import java.util.Arrays;
class FirstUniqueChar 
{
	public static int findIndex(String s){
		char arr[]=s.toCharArray();
		int freq[]=new int[26];
		for(char ch:arr)
		{
			freq[ch-'a']++;
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<s.length();i++){
			
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
