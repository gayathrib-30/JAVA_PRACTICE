import java.util.Arrays;
class Panagram 
{
	public static void main(String[] args) 
	{
		String s="the quick brown foz jumps over the lazy dog";
		boolean arr[]=new boolean[26];
		for(int i=0;i<arr.length;i++){
			arr[i]=false;
		}
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch==' ')continue;
				arr[ch-97]=true;
		}
		System.out.println(Arrays.toString(arr));
	}
}
