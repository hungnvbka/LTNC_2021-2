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
		
		double squareDistance = Math.pow(x[0] - x[1], 2) + Math.pow(y[0] - y[1], 2);
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
