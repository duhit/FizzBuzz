package org.cloudwick;

import java.util.Scanner;

public class RecursiveFactorial {
	
	public int factorial(int n){
		if(n == 0)
			return 1;
		else
			return n*factorial(n-1);
	}
	
	public static void main(String[] args) {
		RecursiveFactorial recursiveObject = new RecursiveFactorial();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		recursiveObject.factorial(number);
	}
}
