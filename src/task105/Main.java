package task105;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.println("Enter text only with math symbols");
		String text=input.nextLine();
		
		Queue<String> numbers= new LinkedList<String>();
		Stack<String>symbols=new Stack<String>();
		
		if ((text = inputCheck(text)) == null) {
			return;
		}
		
		for (int i = 1; i < text.length(); i += 2) {
			symbols.push(Character.toString(text.charAt(i)));
		}
		
		for (int i = 0; i < text.length(); i += 2) {
			numbers.offer(Character.toString(text.charAt(i)));
		}
		int num1=0;
		int num2=0;
		while (!symbols.isEmpty()) {
			if (symbols.pop().contains("+")) {
				num1 = Integer.parseInt(numbers.poll());
				num2 = Integer.parseInt(numbers.poll());
				numbers.offer(Integer.toString(num1 + num2));
			} else {
				num1 = Integer.parseInt(numbers.poll());
				num2 = Integer.parseInt(numbers.poll());
				numbers.offer(Integer.toString(num1 - num2));
			}
		}
		
		System.out.println("result: " + numbers.poll());
		input.close();

		
	}
	
	public static String inputCheck(String input){
		input = input.replaceAll("\\s+","");	
		
		if(input.isEmpty()){
			System.out.println("It is empty!");
			return null;
		}
		if(input.length()%2==0){
			System.out.println("The characters must be odd");
			return null;
		}
		for(int i=0;i<input.length();i++){
			
			if(i%2==0 && !Character.isDigit(input.charAt(i)) && i>=0 && i<=9 ){
				System.out.println("Invalid input, wrong characters");
				return null;
			}else if(i%2!=0 && input.charAt(i)!= '-' && input.charAt(i)!= '+'){
				System.out.println("There must be + or - only as a mathematical characters!");
				return null;
			}else if(i==0){
				System.out.println("There must be more than one character!");
				return null;
			}
		}
		return input;
	}

}
	
