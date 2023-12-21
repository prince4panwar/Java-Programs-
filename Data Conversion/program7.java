//How to convert String to double
 class a
{
	public static void main(String[] args) 
	{
		String str = "0.5";
		double D=Double.parseDouble(str);
		System.out.println("String is "+str);
		System.out.println("String Converted to an Double "+ D);
		System.out.println("Showing the String was converted to Double above "+(1+D));
	}
}