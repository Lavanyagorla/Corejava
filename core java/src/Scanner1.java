import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner scan= new Scanner(System.in);
	   System.out.println("enter name");
	   String name= scan.nextLine();
	   System.out.println("enter age");
	   int age= scan.nextInt();
	   scan.nextLine();
	   System.out.println("enter city");
	   String city = scan.nextLine();
	   System.out.println("enter percentage");
	   Double per =scan.nextDouble();
	   System.out.println("name ---->"+name);
	   System.out.println("age ---->"+age);
	   System.out.println("city ---->"+city);
	   System.out.println("percentage ---->"+per);
	}

}
