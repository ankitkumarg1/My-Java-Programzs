//Wap to determine wheather given number is ArmStrong Number or Not

import java.util.*;


class ArmStrongNumbers 
{
/*public static int power(int num,int pwr) //using recursion method to solve the problem
	{
	int res =1;
      while(pwr>0)
		{
		res = res*power(num,pwr);
        }
		return res;
	}*/ 

	public static int countOfDigits(int num)
	{
        int c= 0;
		while(num>0)
		{
		    num = num/10;
		    c++;
		}
		return c;
	}

public static boolean isArmStrong(int num,int count) //using recursion ==calling the method from inside of it
	{
	  double out = 0;
	  int temp = num;
      while(num>0)
		{
	   int rem = num%10;
       out = out+Math.pow(rem,count);
       num = num/10;
		}
		return (out == temp); 
	}
	
public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a number: ");
	   int num = sc.nextInt();
         
	   /*if(num%10!=0)
		{
		   boolean a=num%10;
		   return ;
		}*/
	   int cn = countOfDigits(num);
	   boolean res=isArmStrong(num,cn); 
       
	   System.out.println((res?"ArmSrong Number":"Not An ArmStrong Number"));	
    }
}
