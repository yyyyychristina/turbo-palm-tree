//Assignment 06
//Chingwing Yeung
//09/25/2022

package mymethodsofpolygonPackage;

import java.util.Scanner;

public class MyClassMethodsofPolygon {

	public static void main(String[] args) {
		// create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//prompt the user to enter number of sides
		System.out.print("Enter the number of sides: ");
		int numberOfSides = input.nextInt();
		
		//prompt the user to enter length of side
		System.out.print("Enter the side: ");
		double lengthOfSide = input.nextDouble();
		
		System.out.println("The area of the polygon is " + area(numberOfSides, lengthOfSide));
	}
	
	public static double area(int n, double side) {
		double area;
		area = (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
		return area;
	}

}
