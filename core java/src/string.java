import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s1="Hello";
		//String s2="world";
		//String s3= s1+s2;
		//System.out.println("equals of two strings:"+s3);
		//String s4= s
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string1:");
		String s1 = scan.nextLine();
		System.out.println("enter string2");
		String s2= scan.nextLine();
		String s3 = s1+s2;
		String s4 = "hello";
		System.out.println("resultant"+ s3);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println("concatation:"+(s1.concat(s2)));
		System.out.println("equals:"+s1.equals(s2));
		System.out.println("startwith:"+ s1.startsWith(s2));
	    System.out.println(s4.indexOf(1));

	}

}
