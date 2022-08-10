import java.util.Scanner;

public class primecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a number");
		int n= scan.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if( count==2)
		{
			System.out.println(+n+"------>prime");
		}else
		System.out.println(+n+"------>not prime");

	}

}
