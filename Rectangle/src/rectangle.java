
public class rectangle {
	private double width;
	private double height;

	public rectangle() {
		width = 3;
		height = 4;
	}

	void setWidth(double newWidth) {
		width = newWidth;
	}

	void setHeight(double newHeight) {
		height = newHeight;
	}

	double getWidth() {
		return width;
	}

	double getHeight() {
		return height;
	}

	double getArea() {
		return width * height;
	}

	double getPerimeter() {
		return 2 * (width + height);
	}

	public static void main(String arg[]) {
		rectangle r = new rectangle();

		System.out.println("Width: " + r.getWidth());
		System.out.println("_______________________________");
		System.out.println("Height: " + r.getHeight());
		System.out.println("_______________________________");
		System.out.println("Area: "+ r.getArea());
		System.out.println("_______________________________");
		System.out.println("Perimeter: "+ r.getPerimeter());
		
	}
}
