package basicJava;

import java.util.Scanner;

class Robot {
	
	public void command(String a) {

		if (a.equals("on")) {  // Cannot use a == "on" because a stores address but not value of the variable
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
	public void run(String a) {
		System.out.println("Entered Command is :" + a);
	}
}

public class Practice {

	public static void main(String[] args) {
		Robot r1 = new Robot();
		Scanner sc = new Scanner(System.in);
		String cmd;
		do {
			System.out.println("Please Enter a Command :");
			cmd = sc.nextLine();
			if (cmd.equals("on") || cmd.equals("off")) {
				r1.command(cmd);
			} else {
				r1.run();
				r1.run(cmd);
			}
		} while (!cmd.equals("off"));

		sc.close();
	}
}
