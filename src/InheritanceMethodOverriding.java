class A1{
	public void show() {
		System.out.println("In A");
	}
}

class B1 extends A1 {
	
	@Override
	public void show() {
		System.out.println("In B\n");
	}
}

class C extends A1 {
	
	public void show() 
	{
		super.show();
		System.out.println("In C");
	}
}


public class InheritanceMethodOverriding {

	public static void main(String[] args) {
		
		B1 obj = new B1();
		obj.show();
		
		C obj1 = new C();
		obj1.show();

	}

}
