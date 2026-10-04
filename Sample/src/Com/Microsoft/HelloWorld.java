package Com.Microsoft;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String args[]) {
		System.out.println(".....Hello World! From Eclipse IDE.....");
		int amount = 34;
		System.out.println("Amount :" + amount);
		HelloWorld.doSomething();
		Scanner sc = new Scanner(System.in);
	}

	public static void doSomething() {
		System.out.println("HelloWorld.doSomething()");
	}
}
