import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter any number");
		num=scan.nextInt();
		if(num%2==0)
			System.out.println(num+" is even");
		else
			System.out.println(num+"is odd");
	

	}

}

