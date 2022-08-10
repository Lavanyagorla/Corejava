import java.util.Scanner;

public class breakandcontinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	for ( int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
			
	}*/
	//	break statement
	/*	for ( int i=1;i<=10;i++)
		{
			if(i>5)
			{
				break;
			}
			System.out.println(i);
			
		}*/
	//primenumbers1to50	
		int n1,n2,i,j;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two numbers");
		n1=scan.nextInt();
		n2=scan.nextInt();
		for( i=n1;i<=n2;i++)
		{
			for( j=2;j<=i;j++)
			{
				if(i%j==0)
					break;
			}
			if(i==j)
				System.out.println(j);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
