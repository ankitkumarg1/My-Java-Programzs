import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number:");
        int a=sc.nextInt();
		 
      for(int i=2;i<=a;i++)
		{
	  for(int j=2;j<=i;j++){
		if(i==j){ 
	     System.out.println(i);
		}
        
		if(i%j==0) {
		break;}
        
	}
}
		}
	}