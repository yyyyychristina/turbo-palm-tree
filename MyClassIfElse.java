//Assignment 03
//Chingwing Yeung
//09/24/2022

package myIfElsePackage;

import java.util.Scanner;

public class MyClassIfElse {

	public static void main(String[] args) {
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// prompt the user to enter input
		System.out.print("Enter age:");
		int age = input.nextInt();
		System.out.print("Enter weight in pounds:");
		int weight = input.nextInt();
		

		
		
		//checking that only  age and weight being positive can be evaluated
        if (age >= 0 && weight >= 0){
        	
        
		//evaluate age and weight to determine which roller coaster to ride
		if (age <= 10 && weight < 80) {
			System.out.println("This person needs to ride the black roller coaster.");
		}
		else if (age <= 10 && (80 <= weight && weight <= 200)) {
			System.out.println("This person needs to ride the green roller coaster.");
		}
		else if (age <= 10 && weight > 200) {
			System.out.println("This person needs to ride the yellow roller coaster.");
		}
		else if (age <= 20 && weight < 80) {
			System.out.println("This person needs to ride the silver roller coaster.");
			
		}
		else if (age <= 20 && (80 <= weight && weight <= 200)){
			System.out.println("This person needs to ride the red roller coaster.");
		}
		else if (age <= 20 && weight > 200) {
			System.out.println("This person needs to ride the purple roller coaster.");
		}
		else {
			System.out.println("This person needs to ride the pink roller coaster.");
		}
        }
        else {
        		System.out.println("Your input is negative.");
    		    System.exit(1);
        	}
        }
        	
		
	}


