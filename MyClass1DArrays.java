//Assignment7
//Chingwing Yeung
//10/07/2022

package my1DArraysPackage;

public class MyClass1DArrays {

	public static void main(String[] args) {
		// Create an array of 1000 integers.
		int[] myList = new int[1000];
		
		// Populate the array with random numbers between 1 and 100.
		for (int i = 0; i < myList.length; i++) {
			/**between a and a + b - 1; a + (int) (Math.random()* b)
			 a = 1,            a + b -1 = 100                            
			 1 + b - 1 = 100       b    =  100                   */
			myList[i] = 1 + (int)(Math.random() * 100);
		}
		
		//invoke method CalcAvaerage to evaluate average 
		//print out the average of the numbers in the array. Be accurate to within two decimal points.
        System.out.printf("%-4.2f", CalcAverage(myList));
        System.out.println();
        
        
        //invoke method countNum to count the number of times each number (1 - 100) appears in the array
        int[] myCountList = countNum(myList);
        //print of the information
        for (int i = 0; i < myCountList.length; i++) {
        	System.out.println("The number " + (int)(i+1) + " appears " + myCountList[i] + " times.");
        }
        
        
        
	}
	/**Calculate the average of the numbers in the array in a method called CalcAverage.
	 * Pass the array to it. 
	 * So my main method can print the average after 
	 * this number is returned from my CalcAverage method.
	 * 
	 */
	public static double CalcAverage(int[] list) {
		int sum = 0;
		for (int i = 0; i <list.length; i++) {
			sum += list[i];
		}
		double average = (sum / list.length);
		return average;
	}
	
	
	
	/** Count the number of times each number (1-100) appears in the array in a method as well. 
	   * use another array called counts for this step. */
	public static int[] countNum(int[] list) {
		int[] counts = new int[100];
		for (int i = 0; i < list.length; i++) {
			counts[list[i] - 1]++; //e.g. when i = 999, list[i] = 1, count[1 - 1] = count[0]++
		}
		return counts;
	}
	

}
