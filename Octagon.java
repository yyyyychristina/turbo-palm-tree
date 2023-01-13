//Chingwing Yeung
//Assignment09
//11/24/22

package myOctagonClassPackage;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable{
	
    private double side;
    private double area;
    
    /** Return side */
	public double getSide() {       
		return side;
	}
	
	/** Set a new side */
	public void setSide(double side) {
		this.side = side;
	}
	
	/** Construct a default Octagon object */
	public Octagon() {		
	}
	
	/** Construct a Octagon object with side */
	public Octagon(double side){
		this.side = side;
	}
	
	/** Override getArea method to calculate Octagon's area*/
	@Override
	public double getArea() {
		area = (2 + 4 / Math.sqrt(2)) * side * side;
		return area;
	}
	
	/** Override getPerimeter method to calculate Octagon's perimeter*/
	@Override
	public double getPerimeter() {
		return side * 8;
	}
    
	/** implement compareTo method defined in Comparable*/
	@Override
	public int compareTo(Octagon o){
		if (area > o.area)
			return 1;
		else if (area < o.area)
			return -1;
		else
			return 0;
	}
	/** Override the protected clone method defined in the Object class, shallow copying, 
	 * and strengthen its accessibility*/
	@Override
	public Object clone() {
		try {
			return super.clone();
		}
		catch (CloneNotSupportedException ex){
			return null;
		}
	}
	
}

