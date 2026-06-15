class Handle2 
{
	public static void main(String[] args) 
	{
		System.out.println("start");
		int arr[]={2,3,4,5,6};
		String s=null;
		try{
			System.out.println(30/0);
		}
		catch(ArithmeticException e){
			System.out.println("Exception1 handled");
		}
		try{
			System.out.println(s.toLowerCase());
		}
		catch(NullPointerException e){
			System.out.println("Exception2 handled");
		}
		try{
			System.out.println(arr[10]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception3 handled");
		}
		
		
		System.out.println("end");
	}
}
