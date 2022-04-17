import java.util.Date;

public class date {
	public static void main (String[] args) {
		long miliSeconds = 1000;
		for(int i = 1; i < 9; i++) {
			Date date = new Date(miliSeconds * (long) Math.pow(10, i));
			System.out.println(date.toString());
		}	
	}
}	