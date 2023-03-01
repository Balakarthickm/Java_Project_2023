package test;

import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		System.out.println("Enter int value of a:");
		int a= x.nextInt();
		System.out.println("Enter int value of b:");
		int b= x.nextInt();
		x.close();
		System.out.println(a+b);
			

	}

}
