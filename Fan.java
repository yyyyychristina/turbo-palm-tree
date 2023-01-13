package myFanClass;

public class Fan {

		/**Design a class named Fan to represent a fan, containing
		 * Three constant: SLOW = 1, MEDIUM =2, FAST =3
		 * private int data field called speed, its default value = SLOW
		 * private boolean data field called on, its default value = false
		 * private double data filed called radius, default = 5
		 * A string data field called color, default = blue
		 * Accessor and Mutator methods for all four data field
		 * No-arg constructor creates a default fan
		 * A method called toString() returning the string description of a fan
		 * If fan is on, the method returns fan speed, color, radius in one combined string
		 * If fan is not on, the method returns fan color ,radius, and string"fan is off" 
		 * in one combined string*/
		
		/**Write a test program which creates two Fan objects
		 * First one: FAST speed, radius = 10, color = yellow, on = true
		 * Second one: MEDIUM speed, radius = 5, color = blue, on = false
		 * invoke fist and second objects toString() method*/
		
		//Three constants: SLOW = 1, MEDIUM =2, FAST =3
		final static int SLOW = 1;
		final static int MEDIUM = 2;
		final static int FAST = 3;
		
		
		//private int data field called speed, its default value = SLOW
		private int speed = SLOW;
		
		
		//private boolean data field called on, its default value = false that is default of boolean
		private boolean on;
		
		//private double data filed called radius, default = 5
		private double radius = 5;
		
		//A string data field called color, default = blue
		String color = "blue";
		
		/**Accessor and Mutator methods for all four data field: speed, on, radius and color*/
		
		//return the speed of the fan
		public int getSpeed() {
			return speed;
		}
		
		//set a new speed of a fan
		public void setSpeed(int speed) {
			this.speed = speed;
		}

		//return whether the fan is on
		public boolean getOn() {
			return on;
		}
		
		//set: turn on a fan
		public void turnOn() {
			on = true;
		}
		
		//set: turn off a fan
		public void turnOff() {
			on = false;
		}
		
		//return radius of a fan
		public double getRadius() {
			return radius;
		}
		
		//set a new radius of a fan
		public void setRadius(double radius) {
			this.radius = radius;
		}
		
		//return color of a fan
		public String getColor() {
			return color;
		}
		
		//set a new color of a fan
		public void setColor(String color) {
			this.color = color;
		}
		
		// No-arg constructor creates a default fan
		public Fan(){	
		}
		
        //A method called toString() returning the string description of a fan, @Override
		/**if-else: on = true : the method returns fan speed, color, radius in one combined string
		 *          else: the method returns fan color ,radius, and string "fan is off" in one combined string*/
		@Override
		public String toString() {
			if (on) {
				return "fan's speed is " + speed + ", color is " + color + " and radius is " + radius 
						+ ".";
			}
			else {
				return "fan's color is " + color + " and radius is " + radius 
						+ " and fan is off.";
			}
		}

}
