class Account
{
	public static void Account() 
	{
		this("amit");
		String accountholder="amit";
        int    accountno;
		int    bal = 1000;
		      
		System.out.println("the current bal is "+bal);
	}

	
}



class Customer
{
	public void Customer() 
	{
		System.out.println(" ");
	}
}


class MainClass 
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts...");
		
		Account a1 = new Account();
		
		System.out.println("Program ends...");
	}
}
