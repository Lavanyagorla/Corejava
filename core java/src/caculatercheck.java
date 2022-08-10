import java.util.Scanner;

public class caculatercheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m, n, add, sub,mul, opt; 
		double div; 
		Scanner scan =new Scanner(System.in);
		System.out.print("enter first number:");
		m=scan.nextInt();
		System.out.print("enter second number:");
		n=scan.nextInt();
		while(true)
		{
			System.out.print("enter 1 for addition:");
			System.out.print("enter 2 for subtraction:");
			System.out.print("enter 3 for multiplication:");
			System.out.print("enter 4 for division:");
			System.out.print("enter 5 for to exit:");
			opt=scan.nextInt();
			switch(opt)
			{
			case 1:
				add=m+n;
				System.out.println("result:"+add);
				break;
			case 2:
				sub=m-n;
				System.out.println("result:"+sub);
				break;
			case 3:
				mul=m*n;
				System.out.println("result:"+mul);
		case 4:		
			div=(double)m / n;
				System.out.println("result:"+div);
			case 5:
				System.exit(0);
			
				
		
			}

		}
		

	}

}
