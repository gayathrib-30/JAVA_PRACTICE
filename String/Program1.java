class Program1 
{
	public static void main(String[] args) 
	{
		//1.lenght() method
		String msg="RCB has won the IPL";
		int Length=msg.length();
		System.out.println("lENGTH OF THE STRING IS: "+Length);
		
		//2.charAt() method
		System.out.println(msg.charAt(6)); //-->at the 6th index what is the character.
		
		//3.indexOf()
		System.out.println(msg.indexOf('a'));
		System.out.println(msg.indexOf('h'));//-->if two characters are present then it will take the first index
		
		//4.lastIndexOf()
		System.out.println(msg.lastIndexOf('h'));//-->if two characters are present then it will take the last index instead of first
		
		//5.toUpperCase()
		String greet="Good Morning";
		System.out.println(greet.toUpperCase());
		
		//6.toLowerCase()
		System.out.println(greet.toLowerCase());
	}
		
}
