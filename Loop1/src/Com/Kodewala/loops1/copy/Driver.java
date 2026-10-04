package Com.Kodewala.loops1.copy;

import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// Create connection with console

		System.out.println("please enter the name: ");
		String name = sc.nextLine();// Reading string input

		System.out.println("plese enter the product price");
		int price = sc.nextInt();

		System.out.println("please enter the address");
		String address = sc.nextLine();

		System.out.println("please enter the passcode");
		int passcode = sc.nextInt();

		System.out.println("please enter the mobileNo");
		int mobileNo = sc.nextInt();
		
		System.out.println("Name is : "+name);
		System.out.println("price is : "+price);
		System.out.println("address is : "+ address);
		System.out.println("passcode is :" + passcode);
		System.out.println("mobileNo is :" + mobileNo);
		
		sc.close();// close the connection.

	}

}
