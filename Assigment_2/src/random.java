import java.util.Random;

public class random {
	public static void main(String arg[]) {
		Random r = new Random(1000);
		for (int i = 0; i < 50; i++) {
			System.out.println(i + ": " + r.nextInt(100));
		}
	}
}
