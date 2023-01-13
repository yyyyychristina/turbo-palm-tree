package myOctagonClassPackage;

public class TestOctagon {

	public static void main(String[] args) {
		Octagon octagon1 = new Octagon(5); /**create an octagon with the side*/
		
		/** Print out the octagon1's area*/
		System.out.println("The area of the octagon is " + octagon1.getArea());

		/**Print out octagon1's perimeter*/
		System.out.println("The perimeter of the octagon is " + octagon1.getPerimeter());

        //create an identical copy of octagon1, shallow copying
		Octagon octagon2 = (Octagon)octagon1.clone();
		
		//compare octagon1 to octagon2
		System.out.println(octagon1.compareTo(octagon2));
	}

}
