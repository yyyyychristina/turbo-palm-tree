package myFanClass;

public class TestFan {

	public static void main(String[] args) {
		// creates first Fan objects
		Fan fan1 = new Fan();
		//Assign First one with: FAST speed, radius = 10, color = yellow, on = true
		fan1.setSpeed(Fan.FAST);  /**similar to final static double PI; use Math.PI to call;*/
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.turnOn();
		
		// creates second Fan objects
		Fan fan2 = new Fan();
		//Assign Second one with: MEDIUM speed, radius = 5, color = blue, on = false
		fan2.setSpeed(Fan.MEDIUM);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.turnOff();
		
		
		//Invoke first object toString() method and print it
		System.out.println(fan1.toString());
		
		//Invoke second object toString() method and print it
		System.out.println(fan2.toString());
	}

}
