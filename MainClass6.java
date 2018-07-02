class Parent
{ 
public Parent()
	{
	this(5);
	System.out.println("this is Parent() constructor");
	}
public Parent(int a1) 
	{
	
	System.out.println("this is Parent(int a1) constructor");
    }
} 

class MainClass6
{
	public static void main(String[] args) 
	{
     System.out.println("Program starts...");
 
     Parent p1 = new Parent();

     System.out.println("Program ends...");
	}
}
