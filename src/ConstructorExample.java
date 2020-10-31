class Calc1
{
	/*
	 * Simple Calulator class
	 */
	
	int num1;
	int num2;
	int result;
	
}


class Calc2
{
	/*
	 * Simple Calulator class
	 */
	
	int num1;
	int num2;
	
	public Calc2()
	{
		num1 = 5;
		num2 = 5;
		System.out.println("Inside Calc2 in first constructor which will intialize num1 and num2");
	}
	
	public Calc2(int k)
	{
		num2 = k;
		
		System.out.println("Inside Calc2 in second constructor which will take argument and will assign it to num2");
	}
	
	public Calc2(int k, double d)
	{
		num2 = k;
		num1 = (int) d;
		
		System.out.println("Inside Calc2 in third constructor which will take two arguments and will assign it to num1 and num2");
	}
	
}


public class ConstructorExample {

	public static void main(String args[]) 
	{
		// creating instance of Calc class
		
		Calc1 obj = new Calc1(); // instnace of class Calc 
		                       // obj is the reference to class 
		                       // new keyowrd is used to create instance of class
		obj.num1 = 10;
		obj.num2 = 15;
	
		System.out.println(obj.num1);
		System.out.println("caling Calc1 just to declare");
		System.out.println("****************************\n");
		
		
		/*
		 * Creating instance of Calc2 and then calling different constructors inside it one by one
		 */
		
		
		Calc2 obj2 = new Calc2(); // Instance of Calc2 with first constructor
		
		System.out.println(obj2.num1);
		System.out.println(obj2.num2);
		System.out.println("****************************\n");
		
		
		Calc2 obj3 = new Calc2(7); // Instance of Calc2 with Second constructor
		System.out.println(obj3.num1);
		System.out.println(obj3.num2);
		System.out.println("****************************\n");
		
		Calc2 obj4 = new Calc2(8, 8.8); // Instance of Calc2 with Third constructor
		System.out.println(obj4.num1);
		System.out.println(obj4.num2);
		System.out.println("****************************\n");

	}

}
