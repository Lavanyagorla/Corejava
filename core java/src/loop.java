import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n1,n2,n3, maximum;
		System.out.println("enter the number 1");
		n1=input.nextInt();
		System.out.println("enter the number 2");
		n2=input.nextInt();
		System.out.println("enter the number 3");
		n3=input.nextInt();
		if(n1 > n2 && n1 > n3)
        maximum = n1;
        else if(n2 > n1 && n2>n1)
maximum =n2;
else
	maximum = n3;
	System.out.printf("maximum  among %d %d and %d is %d",n1,n2,n3,maximum)	;
		
	}

}
