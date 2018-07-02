import java.util.Scanner;
class Fibonacci 
{
	
public static void printFibbo(int c,int n1,int n2) //c=  no. of number we want to display,n1 = initial value of n1,n2 = initial value of n2
	{
      if(c>0)          
		{
         int n3 = n1+n2; 
		 System.out.println(n1+",");
         printFibbo(--c,n2,n3);
		}
	}

public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
	 	int c = sc.nextInt();
	    	
        printFibbo(c,0,1); // 
        
		
	}
}
