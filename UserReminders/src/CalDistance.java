import java.util.Scanner;

public class CalDistance {
	public static void main(String[] args) {
		int[] x = new int[2];
		int[] y = new int[2];

		Scanner myObj = new Scanner(System.in); // Create a Scanner object

//		Create vector
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter vector " + (i + 1));

//	    Create horzontal
			System.out.println("Enter x:");
			x[i] = myObj.nextInt(); // Read
//			System.out.println("horzontal: " + x);

//	    Create vertical
			System.out.println("Enter y:");
			y[i] = myObj.nextInt(); // Read
//			System.out.println("horzontal: " + y);
			System.out.println("----------------------------------------------");

		}
		
		double squareDistance = Math.pow(x[0] - x[1], 2) + Math.pow(y[0] - y[1], 2);
		double distance = Math.sqrt(squareDistance);
		System.out.println("Distance of 2 vector: " + distance);
	}
}
