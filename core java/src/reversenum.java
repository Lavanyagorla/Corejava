
public class reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345, reversed=0;
		for(;num !=0; num/=10)
		{
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			
		}
		System.out.println("reversed number:"+ reversed);

	}

}
