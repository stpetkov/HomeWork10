package task103;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String text = sc.nextLine();
		int count = 0;
		String[] arr = text.split("[ ]");
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i].equals(word)) {
				count++;
			}
		}

		System.out.print("The word : " + word + "is meeting [" + count + "] times !");
		sc.close();
	}

}