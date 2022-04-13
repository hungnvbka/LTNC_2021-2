
public class rectangle {
	double width;
	double height;

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
}
