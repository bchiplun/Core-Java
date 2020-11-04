class Calculator { // SuperClass
	
	public int add(int i, int j)
	{
		return i+j;
	}
}

class CalcAdv extends Calculator {   //SUbclass of Calculator
	
	public int sub(int i, int j)
	{
		return i-j;
	}
}

class AdvCalc extends CalcAdv { //subclass of CalcAdv hence inheritates both Calculator and CalcAdv
	
	public int mul(int i, int j)
	{
		return i*j;
	}
}



public class InheritanceDemo {

	public static void main(String[] args) {
		
		// only Calling Class AdvClass and inheriting all methods.
		
		AdvCalc c1 = new AdvCalc(); 
		
		System.out.println(c1.add(4,5));
		System.out.println(c1.sub(4,5));
		System.out.println(c1.mul(4,5));

	}

}
