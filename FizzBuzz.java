package org.cloudwick;

import java.util.Scanner;

public class FizzBuzz {
	public int getUserInput(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		return number;
	}
	
	public void priintFizz(){
		System.out.println("Fizz");
	}
	public void printBuzz(){
		System.out.println("Buzz");
	}
	
	public static void main(String[] args) {
		FizzBuzz object = new FizzBuzz();
		while(true){
			int userInput = object.getUserInput();
			if(userInput%3 == 0){
				object.priintFizz();
			}
			if(userInput%5 == 0){
				object.printBuzz();
			}
			if(userInput%3 == 0 && userInput%5 == 0){
				object.priintFizz();
				object.printBuzz();
			}else{
				System.out.println("you have entered = " + userInput);
			}
		}
		
		
	}
}
