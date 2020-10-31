class Calc
{
	/*
	 * Simple Calulator class
	 */
	
	int num1;
	int num2;
	int result;
	
	public void Perform()  // Method in class
	{
		result = num1+num2;
	} // Class creation complete
}


public class ClassesAndObjects {

	public static void main(String[] args) 
	{
		// creating instance of Calc class
		
		Calc obj = new Calc(); // instnace of class Calc 
		                       // obj is the reference to class 
		                       // new keyowrd is used to create instance of class
		obj.num1 = 10;
		obj.num2 = 15;
		obj.Perform();  // calling method from class
		System.out.println(obj.result);
		

	}

}
