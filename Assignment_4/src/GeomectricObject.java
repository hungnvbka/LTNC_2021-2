
/**
 * 
 */

/**
 * @author hungn
 *
 */
import java.util.Date;

public class GeomectricObject {

	protected String color = "WHITE";
	protected boolean filled = true;
	protected Date dateCreated = new Date();

	public GeomectricObject() {

	}

	public GeomectricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return this.filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public String toString() {
		String string = "- Color: " + this.color + "\n- It's fill (T/F): " + this.filled
				+ "\n- Date created: " + this.dateCreated;

		return string;
	}

	public static void main(String arg[]) {
		GeomectricObject g = new GeomectricObject();

		System.out.println(g.toString());
	}
}
