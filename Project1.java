import java.util.Scanner;
class Project1
{
	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);   //defining the scanner class
       System.out.println("ENTER THE FIRST NUMBER: ");
	   float a=sc.nextInt();  //giving the value of a
       
	   System.out.println("ENTER THE SECOND NUMBER: ");
	   float b=sc.nextInt();  //giving the value of b
       
	   double res=a*b;  //defining the result
	   System.out.println("THE RESULT IS= "+res);
	  
       }
}




