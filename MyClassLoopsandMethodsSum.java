//Assignment 04
//Chingwing Yeung
//09/25/2022

package myloopsandmethodsPackage;

import java.util.Scanner;

public class MyClassLoopsandMethodsSum {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter input
		System.out.println("Please enter a number: ");
		int number = input.nextInt();
		
		//call a method and print its returns
		System.out.println("Sum of the digits in the number " + number + " is: " + sumDigits(number));
		
	}
	public static int sumDigits(long n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n = n / 10;
		}
		return sum;
	}
	}


