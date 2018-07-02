class PetrolRates
{
	public int petrolRates()
	{
		  return 60;
	}
}

class PetrolRates1 extends PetrolRates
{
	public int petrolRates()
	{
	       return 75;
	}
}

class PetrolRates2 extends PetrolRates1
{
	public int petrolRates()
	{
	  return 70;
	}
}


class PetrolRates3 extends PetrolRates2
{
	public int petrolRates()
	{
	    return 80;
	}
}

class MainClass14 
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts...");

        PetrolRates p  = new PetrolRates();
		PetrolRates q  = new PetrolRates1();
        PetrolRates r = new PetrolRates2();
		PetrolRates s = new PetrolRates3();
		
		System.out.println("THE PETROL RATE IN JANUARY WAS : "+p.petrolRates());
		System.out.println("THE PETROL RATE IN FEBRAURY WAS : "+q.petrolRates());
	    System.out.println("THE PETROL RATE IN MARCH WAS : "+r.petrolRates());
        System.out.println("THE PETROL RATE IN APRIL WAS : "+s.petrolRates());

	    System.out.println("Program Ends...");
	}
}
