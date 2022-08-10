import java.util.Scanner;

public class daysprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a weekday number:");
	int weekday= scan.nextInt();
		String day;
		switch (weekday) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tusday");
		break;
		case 4:
			System.out.println("wednesday");
			break;
			case 5:
				System.out.println("thursday");
				break;
			case 6:
				System.out.println("friday");
				break;
			case 7:
				System.out.println("saturday");
				break;
				default:
					System.out.println("invalid");
					break;
		}

	}

}
