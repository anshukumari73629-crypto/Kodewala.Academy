package Com.Scannar.Student;

import java.util.Scanner;

public class College {

	public College() {
	
	}

	public static void main(String[] args) {
		int num1 = 56;
		int num2 = 45;
		int num3 = 43;
		int num4 = 32;
		
		System.out.println("Number 1 :"+ num1);
		System.out.println("Number 2 :"+ num2);
		System.out.println("Number 3 :"+ num3);
		System.out.println("Number 4 :"+ num4);
		
		AddNumbers.addition();
		
		Scanner sc = new Scanner(System.in);
	}
	
	public static void addition () {
		int result = 20 + 30;
		System.out.println("Addition : "+ result);
	}
}
		
		
