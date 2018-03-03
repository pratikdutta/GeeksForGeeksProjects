package home.pratik.puzzles;

import java.util.Scanner;

public class EvenOrOddWithoutConditionals {

	public static void main(String[] args) {
		String[] outputArray = {"Even", "Odd"};
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(outputArray[input%2]);
		sc.close();
	}
}
