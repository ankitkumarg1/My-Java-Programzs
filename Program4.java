class Program4 
{
	public static void main(String[] args) 
	{
		int num= 4;
		int count =1;
		for(int line = 1;line<=num;line++)
		{
			for(int ele = 1; ele <= line;ele++)
			{
				if(count % 2 == 0)
				{
		         System.out.print("0 ");
				}
				else
				{
			    System.out.print("1 ");
				}
	          count++;
	        }
               System.out.println();
	
        }
	}
}