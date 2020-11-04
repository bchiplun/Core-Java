class A{
	
	public A()
	{
		System.out.println("inside A");
	}
	
	public A(int i)
	{
		System.out.println("Inside A int");
	}
	
}

class B extends A{
	
	public B()
	{
		System.out.println("inside B");
	}
	
	public B(int i)
	{
		super(5);
		System.out.println("inside B with super to int A");
	}
	
	public B(int j, int k)
	{
		super();
		System.out.println("inside B with only super");
	}
}
public class SuperKeyword 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		B c1 = new B();
		System.out.println("***************\n");
		B c2 = new B(5);
		System.out.println("***************\n");
		B c3 = new B(5,4);
		System.out.println("***************\n");

	}

}
