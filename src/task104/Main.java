package task104;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String text = sc.nextLine();
		String[] arr = text.split("[.]");
		for (String a : arr) {
			if (a.contains(word)) {
				System.out.println(a + ".");
			}
		}
		sc.close();
	}
}
