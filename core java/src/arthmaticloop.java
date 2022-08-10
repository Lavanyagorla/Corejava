import java.util.Scanner;

public class arthmaticloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		Scanner scan =new Scanner(System.in);
		int a=0,b=0,res=0;
		char x;
		System.out.println("enter a value:");
		a=scan.nextInt();
		System.out.println("enter b value:");
		b=scan.nextInt();
		System.out.println("enter operation value:");
		x=scan.next().charAt(0);
		switch (x){
		case '+':
			res=a+b;
	break;
		case '-':
			res=a-b;
			break;
		case '*':
			res=a*b;
		break;
		case '/':
			res=a/b;
			break;
				default:
					System.out.println("invalid operation");
					break;
		}
		System.out.println(a+" "+x+" "+b+" "+res);

	}

}
