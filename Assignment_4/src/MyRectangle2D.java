
public class MyRectangle2D {
	private double x, y;
	private double height, width;

	public MyRectangle2D() {
		this.x = 0;
		this.y = 0;
		this.height = 1;
		this.width = 1;// TODO Auto-generated constructor stub
	}

	public MyRectangle2D(double x, double y, double height, double width) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public double getWidth() {
		return this.width;
	}

	public double getHeight() {
		return this.height;
	}

	public double getPerimeter() {
		return 2 * (this.height + this.width);
	}

	public double getArea() {
		return this.height * this.width;
	}

	public double getAreaTriangle(double x0, double y0, double x1, double y1, double x2, double y2) {
		double d0 = Math.sqrt(Math.pow(Math.abs(x0 - x1), 2) + Math.pow(Math.abs(y0 - y1), 2));
		double d1 = Math.sqrt(Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2));
		double d2 = Math.sqrt(Math.pow(Math.abs(x0 - x2), 2) + Math.pow(Math.abs(y0 - y2), 2));
		double p = (d0 + d1 + d2) / 2;
		double s = Math.sqrt(p * (p - d0) * (p - d1) * (p - d2));

		return s;
	}

	public boolean contains(double x, double y) {
		double x1 = this.x - this.width / 2;
		double x2 = this.x + this.width / 2;
		double y1 = this.y - this.height / 2;
		double y2 = this.y + this.height / 2;
		double s0 = getAreaTriangle(x, y, x1, y1, x2, y2);
		double s1 = getAreaTriangle(x, y, x1, y2, x2, y2);
		double s2 = getAreaTriangle(x, y, x1, y1, x1, y2);
		double s3 = getAreaTriangle(x, y, x1, y1, x2, y1);

		if (this.getArea() == (s0 + s1 + s2 + s3)) {
			return true;
		} else
			return false;
	}

	public boolean contains(MyRectangle2D r) {
		double x1 = r.x - r.width / 2;
		double x2 = r.x + r.width / 2;
		double y1 = r.y - r.height / 2;
		double y2 = r.y + r.height / 2;

		if (this.contains(x1, y1) && this.contains(x1, y2) && this.contains(x2, y1) && this.contains(x2, y2)) {
			return true;
		} else
			return false;
	}

	public void printRectangel() {
		System.out.println("- Rectangle center coordinates: (" + this.getX() + ", " + this.getY() + ").\n- Width: "
				+ this.getWidth() + "cm, Height: " + this.getHeight() + "cm.\n- Perimeter: " + this.getPerimeter()
				+ "cm.\n- Area: " + this.getArea() + "cm^2.");
	}

	public static void main(String arg[]) {
		MyRectangle2D smallRectangle = new MyRectangle2D();
		MyRectangle2D bigRectangle = new MyRectangle2D(0, 0, 10, 20);

		System.out.println("Small Rectangle: ");
		smallRectangle.printRectangel();
		System.out.println("_______________________________________________________________");
		System.out.println("Big Rectangle: ");
		bigRectangle.printRectangel();
		System.out.println("_______________________________________________________________");
		System.out.println("Is the point P(2,5) inside the big rectangle (T/F)?: " + bigRectangle.contains(2, 5));
		System.out.println(
				"Is the small rectangle insdie the big rectangle (T/F)?: " + bigRectangle.contains(smallRectangle));

	}
}
