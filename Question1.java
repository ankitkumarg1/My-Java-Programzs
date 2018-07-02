//static members can be overridden or not
class Question1 
{
public static void main(String[] args) 
	{
		SubClass sub1 = new SubClass();
		sub1.a;
	}
}

class SuperClass
{
	static int a = 12;
	System.out.println("a = "+a);
}


class SubClass extends SuperClass 
{
@Override
static int a =20;
System.out.println("a = "+a);
}