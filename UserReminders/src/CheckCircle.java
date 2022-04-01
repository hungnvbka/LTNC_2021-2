import java.util.Scanner;

public class CheckCircle {
	public static void main(String[] args) {
		int[] x = new int[2];
		int[] y = new int[2];
//		double[] distance = new double[2];
		int[] radius = new int[2];

		Scanner myObj = new Scanner(System.in); // Create a Scanner object

//		Create vector center
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter center of circle " + (i + 1) + ": ");

//	    Create horzontal
			System.out.println("Enter x:");
			x[i] = myObj.nextInt(); // Read
//			System.out.println("horzontal: " + x);

//	    Create vertical
			System.out.println("Enter y:");
			y[i] = myObj.nextInt(); // Read
//			System.out.println("horzontal: " + y);

//		    Create horzontal
			System.out.println("Enter radius:");
			radius[i] = myObj.nextInt(); // Read
//			System.out.println("horzontal: " + x);			
			System.out.println("----------------------------------------------");

		}

		double[] squareX = new double[2];
		double[] squareY = new double[2];
		for (int i = 0; i < 2; i++) {
			squareX[i] = Math.pow(x[i], 2);
			squareY[i] = Math.pow(y[i], 2);
		}
		double squareDistance = Math.pow(squareX[0] - squareX[1], 2) + Math.pow(squareY[0] - squareY[1], 2);
		double distance = Math.sqrt(squareDistance);
		if (distance > (radius[0] + radius[1])) {
			System.out.println("Two circles do not intersect!");
			System.out.println("----------------------------------------------");
		}
		if(distance < Math.abs(radius[0]- radius[1])) {
			System.out.println("Two full circles nested!");
			System.out.println("----------------------------------------------");
		}
		if(distance > Math.abs(radius[0]- radius[1]) && distance < Math.abs(radius[0]+ radius[1])) {
			System.out.println("Two circles intersect!");
			System.out.println("----------------------------------------------");
		}
	}
}
