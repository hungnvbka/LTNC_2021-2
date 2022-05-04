
public class Circle extends GeomectricObject {
	private double radius;

	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		this.color = color;
		this.filled = filled;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.pow(this.radius, 2) * Math.PI;
	}

	public double getPerimeter() {
		return 2 * Math.PI * (this.radius);
	}

	public double getDiameter() {
		return 2 * (this.radius);
	}

	public void printCircle() {
		System.out.println("This is my circle: \n- Radius: " + this.getRadius() + "\n" + this.toString());
		System.out.println("- Deiameter: " + this.getDiameter() + "\n- Perimeter: " + this.getPerimeter() + "\n- Area: "
				+ this.getArea());
	}

	public static void main(String arg[]) {
		Circle c = new Circle(2.4, "BLUE", false);

		System.out.println(c.toString());
		System.out.println("___________________________________________________");
		c.setColor("RED");
		c.setFilled(true);
		c.setRadius(2.5);
		c.printCircle();
	}
}
