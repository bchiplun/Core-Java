
public class IterationLoops {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		/*
		 * Printing pattern 1
		 */
		
		int n = 6;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.print("\r");
		}
		
		System.out.println("*********************");
		
		
		/*
		 * Printing pattern 2
		 */
		
		for(int i=65; i<=65+n; i++)
		{
			for(int j=65; j<=i; j++)
			{
				System.out.print((char)j+" ");
			}
			System.out.print("\r");
		}
		
		System.out.println("*********************");
		
		
		/*
		 * Printing pattern 3
		 */
		
		n = 5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i!=1 && i!=n)
				{
					if(j!=1 && j!=n)
					{
						System.out.print("  ");
						continue;
					}
				}
				System.out.print("* ");
			}
			System.out.print("\r");
		}
		
		System.out.println("*********************");
 		
		//

	}

}

