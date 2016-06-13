package task101;

import java.util.Scanner;

public class Main {
	public static String reverse(String source) {
		StringBuilder dest = new StringBuilder(source.length());
		for (int i = (source.length() - 1); i >= 0; i--) {
			dest.append(source.charAt(i));
		}
		return dest.toString();
	}

	public static void main(String[] args) {
		System.out.print("Enter a word which is going to be reversed : ");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		System.out.print(reverse(text));
		sc.close();
	}

}
