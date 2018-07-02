import java.util.Scanner; 

class Bmi
{
public void bmiIndex(double weight,double height)
	{
    double bmi = weight/(height * height);
	System.out.println("BMI = "+bmi);
    if(bmi<18.5)
		{
		System.out.println("UnderWeight");
		}
	
	else if(bmi<=25)
		{
		System.out.println("Normal");
		}

		else
		{
			System.out.println("OverWeight");
		}
	
	}
}
class Mainclass5
{
public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
	   System.out.print("weight = ");
       double a = sc.nextDouble();
	    System.out.print("height = ");
       double b = sc.nextDouble();
    
	Bmi e = new Bmi();
	e.bmiIndex(a,b);
		
	}
}
