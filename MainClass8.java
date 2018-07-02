class NonStatic1
{
	int a = 9;//at Declaration time
	
		//using blocks
		{
		    a= 10;
			System.out.println("executing non-static block ");
		}


	//using constructors
		public NonStatic1()
		{
		    a = 11;
		 	System.out.println("executing non-static constructor");
		} 
}


class MainClass8 
{
	
	public static void main(String[] args) 
	{
		System.out.println("Program Starts...");

		NonStatic1 b = new NonStatic1();
     
	System.out.println("a = "+b.a);

        System.out.println("Program Ends...");
	}
}
