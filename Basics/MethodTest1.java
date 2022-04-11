class MethodTest1
{
	

	static int checkPrice(int n,int m)
	{
		if(n>100)
		{
		return 0;
		}

		else
		{
		return 1;
		}
	}
		


	static void display()
	{
	System.out.println("ACP College Students ..");
	}

	public static void main(String[] args)
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);

		System.out.println(" Enter amount..");
		int amt=sc.nextInt();

		System.out.println(" Enter Batch number..");
		int batch=sc.nextInt();

		

		for(int i=1;i<=2;i++)
			{
			MethodTest1.display();
			}

		if( MethodTest1.checkPrice(amt,batch) == 0)
			{
			System.out.println(" High Price");
			}
		else
			{
			System.out.println(" Low Price");
			}
	}

	
}






 
