
import java.util.Scanner;

public class ATM {
	static Account[] acc = new Account[10];
	static int id;

	public static void main(String arg[]) {
		Scanner Obj = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			acc[i] = new Account(i, 1000000);
		}
		int choice = 0;

		while (true) {
			System.out.println("Enter an id: ");
			id = Obj.nextInt();

			System.out.println("Main menu");
			System.out.println("1. Check balance");
			System.out.println("2. withdraw");
			System.out.println("3. Deposit");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");

			choice = Obj.nextInt();

			switch (choice) {
			case 1:
				System.out.println(acc[id].getBalance());
				break;
			case 2:
				System.out.println("Enter an amount to withdraw:");
				int money_withdraw = Obj.nextInt();
				acc[id].withdraw(money_withdraw);
				break;
			case 3:
				System.out.println("Enter an amount to deposit:");
				int money_deposit = Obj.nextInt();
				acc[id].deposit(money_deposit);
				break;
			}
		}
	}
}
