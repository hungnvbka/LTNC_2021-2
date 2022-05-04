
public class MyInteger {
	private int value = 0;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	public boolean isEven() {
		if ((value % 2) == 0) {
			return true;
		} else
			return false;
	}

	public static boolean isEven(int value) {
		if ((value % 2) == 0) {
			return true;
		} else
			return false;
	}

	public static boolean isEven(MyInteger value) {
		if ((value.value % 2) == 0) {
			return true;
		} else
			return false;
	}

	public boolean isOdd() {
		if ((value % 2) == 1) {
			return true;
		} else
			return false;
	}

	public static boolean isOdd(int value) {
		if ((value % 2) == 1) {
			return true;
		} else
			return false;
	}

	public static boolean isOdd(MyInteger value) {
		if ((value.value % 2) == 1) {
			return true;
		} else
			return false;
	}

	public boolean isPrime() {
		if (value < 2) {
			return false;
		}
		for (int i = 2; i < value - 1; i++) {
			if ((value % i) == 0)
				return false;
		}
		return true;
	}

	public static boolean isPrime(int value) {
		if (value < 2) {
			return false;
		}
		for (int i = 2; i < value - 1; i++) {
			if ((value % i) == 0)
				return false;
		}
		return true;
	}

	public static boolean isPrime(MyInteger value) {
		if (value.value < 2) {
			return false;
		}
		for (int i = 2; i < value.value - 1; i++) {
			if ((value.value % i) == 0)
				return false;
		}
		return true;
	}

	public boolean equals(int value) {
		if (this.value == value) {
			return true;
		} else
			return false;
	}

	public boolean equals(MyInteger value) {
		if (this.value == value.value) {
			return true;
		} else
			return false;
	}

	public static int parseInt(char[] charArr) {
		int value = 0;
		for (char c : charArr) {
			value = value * 10 + (c - '0');
		}
		return value;
	}

	public static int parseInt(String string) {
		int value = 0;
		for (int i = 0; i < string.length(); i++) {
			value = value * 10 + (string.charAt(i) - '0');
		}
		return value;
	}

	public static void main(String arg[]) {
		char[] intArr = new char[] { '4', '3', '7' };

		MyInteger myInteger = new MyInteger(5);

		System.out.println("My integer: " + myInteger.getValue());
		System.out.println("It's an even! (T/F): " + myInteger.isEven());
		System.out.println("It's an odd! (T/F): " + myInteger.isOdd());
		System.out.println("It's a prime! (T/F): " + myInteger.isPrime());
		System.out.println("It's an even! (T/F): " + isEven(3));
		System.out.println("It's an odd! (T/F): " + isOdd(5));
		System.out.println("It's a prime! (T/F): " + isPrime(6));
		System.out.println("It's an even! (T/F): " + isEven(myInteger));
		System.out.println("It's an odd! (T/F): " + isOdd(myInteger));
		System.out.println("It's a prime! (T/F): " + isPrime(myInteger));
		System.out.println(myInteger.equals(new MyInteger(5)));
		System.out.println(parseInt("1412"));
		System.out.println(parseInt(intArr));
	}
}
