import java.util.*;
class Perfect
{
	public static void main(String[] args)
	{
//--------------------------------------
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter a range. !");
	int n=sc.nextInt();
	int m=sc.nextInt();

/*	for(int i=n;i<=m;i++)
	{
		if ( new Perfect().isPerfect(i)==1  || new Perfect().checkOdd(i)==1  )
			{
			System.out.print(i + " ");
			}
	}
*/

	if ( new Perfect().checkOdd(m)==1 )
	System.out.println(m +" is a odd number !");

	else
	System.out.println(m +" is not a odd number !");

/*
	if ( new Perfect().isPerfect(n)==1 )
	System.out.println(n +" is a perfect number !");
		
	else
	System.out.println(n +" is not a perfect number !");
*/
	}
//--------------------------------------
	int isPerfect(int n) 
	{

	int sum=0;

	for(int i = 1; i<=n-1; i++)
	{
		if(n%i==0)
		{
		sum=sum+i;
		}
	}

	if(n==sum)
	{
	return 1;
	}

	else
	{
	return 0;
	}
	}
//--------------------------------

	int checkOdd(int a)
	{
	if (a%2 == 1)
	return 1;

	return 0;
	}
	
}
