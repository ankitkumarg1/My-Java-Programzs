import java.util.Scanner;
class PrintOddNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int a=sc.nextInt();

		for(int i=1;i<=a;i=i+2)
		{
			System.out.println(i);
	}
}
}
