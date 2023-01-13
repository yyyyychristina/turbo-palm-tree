//Assignment 05
//Chingwing Yeung
//9/22/2022

package mystringPackage;

import java.util.Scanner;

public class MyClassString {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter input
		System.out.println("Please input 3 city names separated "
				+ "by spaces in one line and press Enter.");
		String city1 = input.next();
		String city2 = input.next();
		String city3 = input.next();
		
		//compare that if alphabetical order of city 1 is smaller than city 2 and city 3
		if ((city1.compareTo(city2) < 0) && (city1.compareTo(city3) < 0)) {
			//compare that alphabetical order of city 2 is smaller than city 3
			if ((city2.compareTo(city3) < 0)) {
				System.out.println(city1);
				System.out.println(city2);
				System.out.println(city3);
			}
			//compare that alphabetical order of city 2 is larger than city 3
			else {
				System.out.println(city1);
				System.out.println(city3);
				System.out.println(city2);
			}
		}
		//compare that if alphabetical order of city 2 is smaller than city 1 and city 3
		else if ((city2.compareTo(city1) < 0) && (city2.compareTo(city3) < 0)) {
			//compare that alphabetical order of city 1 is smaller than city 3
			if ((city1.compareTo(city3) < 0)) {
				System.out.println(city2);
				System.out.println(city1);
				System.out.println(city3);
			}
			//compare that alphabetical order of city 1 is larger than city 3
			else {
				System.out.println(city2);
				System.out.println(city3);
				System.out.println(city1);
			}
		}
		//compare that if alphabetical order of city 3 is smaller than city 1 and city 2
		else {
			//compare that alphabetical order of city 1 is smaller than city 2
			if ((city1.compareTo(city2) < 0)) {
				System.out.println(city3);
				System.out.println(city1);
				System.out.println(city2);
			}
			//compare that alphabetical order of city 1 is larger than city 2
			else {
				System.out.println(city3);
				System.out.println(city2);
				System.out.println(city1);
			}
		}
		

	}

}
