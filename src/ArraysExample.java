
public class ArraysExample {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//Creating 1-D array
		
		int a[] = new int[4];
		a[0] = 1;
		a[1] = 2;
		
		for(int i=0; i<4; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("**********\n");
		
		
		//2-d array
		
		int b[][] = {
				        {1,2,3,4},
				        {2,3,4,5},
				        {4,5,6,7},
		            };
		
		// Printing 2-D array
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<4; j++)
			{
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		System.out.println("**********\n");
		
		
		// Creating jagged array
		
		int c[][] = {
				        {1,2,3,4},
				        {6,7,8},
				        {1,2,3,4,5,6}
		            };
		// Printing jagged array
		
		for(int i=0; i<c.length; i++)
		{
			for(int j=0; j<c[i].length; j++)
			{
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
		System.out.println("**********\n");

	}

}
