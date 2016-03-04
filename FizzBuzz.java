package org.cloudwick;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.RejectedExecutionException;

public class FizzBuzz {
	private static int userInput;
	
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
			try{
				userInput = object.getUserInput();
				if(userInput <= 0)
					throw new InputMismatchException();
				
			}catch(InputMismatchException e){
				e.printStackTrace();
				System.out.println("number should only be a positive integer greater than 0");
				continue;
			}
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
