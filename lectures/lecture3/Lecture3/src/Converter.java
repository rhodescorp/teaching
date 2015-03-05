import java.util.Scanner;


public class Converter {

	public static void main(String[] args) {
		String s = args[0] + " " + args[1];
		
		char[] charArray = s.toCharArray();
		
		System.out.println(charArray[3]);
		System.out.println(s);
		
		Scanner in = new Scanner(System.in);
		s = in.nextLine();
		
		for (int i = 0; i < s.length(); ++i) {
			System.out.println(i % 2);
		}
	}

}
