
public class strsb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello world");
		System.out.println("length----->"+sb.length());
		System.out.println("capacity----->"+sb.capacity());
		System.out.println("replace----->"+sb.replace(0, 4," lavanya"));
		System.out.println("insert----->"+sb.insert(0," gorla"));
		System.out.println("delete----->"+sb.delete(4, 5));
		System.out.println("reverse----->"+sb.reverse());
		System.out.println("length----->"+sb.append("apple"));
	

	}

}
