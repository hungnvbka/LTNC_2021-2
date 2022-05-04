
public class Fan {
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;

	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String color = "BLUE";

	public Fan() {

	}

	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setRadius(double newRadius) {
		radius = newRadius;
	}

	public double getRadius() {
		return radius;
	}

	public void setColor(String newColor) {
		color = newColor;
	}

	public String getColor() {
		return color;
	}

	public void turnOn() {
		if (!on) {
			on = true;
		} else {
			System.out.println("The fan is on, buddy!");
			System.out.println("______________________________________");
		}
	}

	public void turnOff() {
		if (on) {
			on = false;
		} else {
			System.out.println("The fan is off, buddy!");
			System.out.println("______________________________________");
		}
	}

	public void to_string() {
		if (on) {
			System.out.println("- Speed: " + speed + "\n- Radius: " + radius + "\n- Color: " + color);
			System.out.println("______________________________________");
		} else {
			System.out.println("- Radius: " + radius + "\n- Color: " + color + "\nThe fan is off, buddy! ");
			System.out.println("______________________________________");
		}
	}
	
	public static void main(String arg[]) {
		Fan fan1 = new Fan();
		
		fan1.setSpeed(FAST);
		fan1.setRadius(10);
		fan1.setColor("YELLOW");
		fan1.turnOn();
		
		Fan fan2 = new Fan();
		
		fan2.setSpeed(MEDIUM);
		fan2.setRadius(5);
		
		fan1.to_string();
		
		fan2.to_string();
	}
}
