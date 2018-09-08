package lesson2.exercise_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//use a Scanner to ask for user's name
		//output the number of occurrences of 'e' in the name
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		
		int count  = 0;
		
		for(int i = 0; i < name.length(); i++) {
			if(name.charAt(i) == 'e') {
				count++;
			}
		}
		input.close();
		System.out.println("E occured " + count + " times");
	}

}
