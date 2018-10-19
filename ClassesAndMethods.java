package basicJava;

import java.util.Scanner;

class Robot {

	void power(String a) {

		if (a.equals("on")) {  // cannot use a == "on" because a stores address but not a value
			System.out.println("Hello World! I'am a Robot");
		} else if (a.equals("off")) {
			System.out.println("Signing Off!");
		} else {
			System.out.println("Unknown Command");
		}
	}
}

public class ClassesAndMethods {

	public static void main(String[] args) {
		Robot r1 = new Robot();
		Scanner sc = new Scanner(System.in);
		String cmd;
		do {
			System.out.println("Please Enter a Command :");
			cmd = sc.nextLine();
			r1.power(cmd);
		} while (cmd.equals("on"));
		sc.close();
	}
}
