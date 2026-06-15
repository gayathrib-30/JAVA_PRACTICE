class OTP 
{
	public static void main(String[] args) 
	{
		int otp=(int)(Math.random()*9000)+1000;//4 0's is given to generate the 4 digit otp,if you need 5 you can give 5 0's
		System.out.println(otp);
	}
}
