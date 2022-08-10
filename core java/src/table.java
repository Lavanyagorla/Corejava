import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter any number");
		num=scan.nextInt();
		for(int i=1; i<=10; i++)
		{
			System.out.println(num+"*"+"="+num*i);
		}

	}

}
