package task102;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String text = sc.nextLine();
		String[] arr = text.split("[ ]");
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i].equals(word)) {
				arr[i] = arr[i].toUpperCase();
			}
		}
		for (String a : arr) {
			System.out.print(a + " ");
		}
		sc.close();
	}

}
