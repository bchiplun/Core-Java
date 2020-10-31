class Calcnew
{
	int num1;
	int num2;
	
	public Calcnew(int num1, int num2)
	{
		/*
		 * this keyword is used when local variable name and instance variable name is same.
		 * so to refer instance or class variable we use this keyword.
		 * where local variables that is method arguments are on right.
		 */
		this.num1 = num1; 
		this.num2 = num2;
	}
}


public class ThisKeyword {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Calcnew obj = new Calcnew(4,5);
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);

	}

}
