//Comparing two arrays and finding the missing number entered by user(enhanced for loop is used)
import java.util.Scanner;

class MainClass1 
{
	public static void main(String[] args) 
	{
		
		
		int [] arr1=new int [100];
		int []arr2=new int[100];
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<arr1.length ;i++ )
		{
			
			arr1[i]=i+1;
		}


		
		for(int x :arr1)
		{
			System.out.print(" "+x);
			
		}
		int k=0;
		System.out.println();

		for (int j = 0; j < arr2.length; j++) 
			{
			System.out.println("Enter the value for " + (j+1) + " : ");
		        arr2[j] = sc.nextInt();
				
				if (arr1[k]!=arr2[j])
				{
					System.out.println("You are missing the value   "+arr1[k]);
					break;
				}
				k++;


			}

		











		
		
			

	}
}
