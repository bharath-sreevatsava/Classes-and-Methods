package basicJava;

import java.util.Scanner;

class Robot {

	public void command(String a) {

		if (a.equals("on")) { // Cannot use a == "on" because a stores address
								// but not value of the variable
			System.out.println("Hello World! I'am a Robot");
		} else if (a.equals("off")) {
			System.out.println("Signing Off!");
		}
	}

	public void run() {
		System.out.println("\t" + "Loading...");
		System.out.println("...........................");
		System.out.println("...........................");
	}
	
	// Overloading method
	public void run(int a) {
		if (a == 1) {  // can be compared using ==
			System.out.println("ok");
		}
		System.out.println("Number of commands after Switching on =" + a);
	}

	// Overloading method
	public void run(String a) {
		System.out.println("Entered Command is :" + a);
	}
}

public class ClassesAndMethods {

	public static void main(String[] args) {
		Robot r1 = new Robot();
		Scanner sc = new Scanner(System.in);
		String cmd;
		int count = 0;
		do {
			System.out.println("Please Enter a Command :");
			cmd = sc.nextLine();
			if (cmd.equals("on") || cmd.equals("off")) {
				r1.command(cmd);
			} else {
				r1.run();
				r1.run(cmd);
				r1.run(count);
				count++;
			}
		} while (!cmd.equals("off"));

		sc.close();
	}
}
