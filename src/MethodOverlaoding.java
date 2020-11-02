class Casio
{
	int num1;
	int num2;
	String operation;
	
	// First defining multiple constructors
	
	public Casio(int num1)
	{
		this.num1 = num1;
		num2 = 0;
		operation = "Nothing";
		System.out.println("Inside first Constructor\n");
	}
	
	public Casio(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
		operation = "Nothing";
		System.out.println("Inside Second Constructor\n");
	}
	
	public Casio(int num1, int num2, String op)
	{
		this.num1 = num1;
		this.num2 = num2;
		operation = op;
		System.out.println("Inside Third Constructor\n");
	}
	
	
	// Defining multiple methods with same name
	
	public void add(int i, int j)
	{
		System.out.println(i+j);
	}
	
	public void add(int i, int j, int k)
	{
		System.out.println(i+j+k);
	}
	
	public void add(double i, double j)
	{
		System.out.println(i+j);
	}
	
}
public class MethodOverlaoding {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Casio obj = new Casio(1);
		obj.add(10, 20);
		System.out.println("*********************\n");
		
		Casio obj2 = new Casio(1,2);
		obj2.add(10, 20, 30);
		System.out.println("*********************\n");
		
		Casio obj3 = new Casio(1,2,"Add");
		obj3.add(10.5, 20);
		System.out.println("*********************\n");
		
		

	}

}
