class Emp
{
	int eid; // non static varaible which will be different for each object of class
	int salary;
	
	static String ceo; // static variable which will be common for all objects of this class
	
	public Emp()
	{
		eid = 1;
		salary = 100;
	}
	
	static
	{
		ceo = "Larry";   //Static constructor to initialize any value only once for all objects of this class
		System.out.println("Inside static mehod/Constructor"); //It will be executed first
	}
	
	public void show()
	{
		System.out.println(eid + " " + salary + " " + ceo);
		System.out.println("Inside non static mehod");
	}
}



public class StaticKeyoword {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Emp Bhavesh = new Emp();
		Bhavesh.eid = 8;
		Bhavesh.salary = 4000;
		
		Emp.ceo = "Ramesh";
		
		Emp Navin = new Emp();
				
		Bhavesh.show();
		System.out.println("*************\n");
		
		Navin.show();
				
			

	}

}
