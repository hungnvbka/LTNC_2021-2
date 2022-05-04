
import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	float annualInterestRate = 0;
	private Date dateCreated;

	public Account() {
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAnnualInterstRate(float annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public int getId() {
		return this.id;
	}

	public double getBalance() {
		return this.balance;
	}

	public float getAnnualInterestRate() {
		return this.annualInterestRate;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public float getMonthlyInterestRate() {
		return this.annualInterestRate / 12;
	}

	public double getMonthlyInterest() {
		return this.balance * this.getMonthlyInterestRate();
	}

	public boolean withdraw(double money) {
		if (money >= 0 && money <= this.balance) {
			this.balance -= money;
			return true;
		} else
			return false;
	}

	public boolean deposit(double money) {
		if (money >= 0) {
			this.balance += money;
			return true;
		} else
			return false;
	}

	public static void main(String arg[]) {
		Account acc = new Account(1412, 5555555);
		acc.setAnnualInterstRate(3.2F);
		acc.withdraw(4521000);
		acc.deposit(2000000);
		System.out.println("This your info: ");
		System.out.println("Balance: " + acc.getBalance());
		System.out.println("Monthly Interset: "+ acc.getMonthlyInterest());
	}
}
