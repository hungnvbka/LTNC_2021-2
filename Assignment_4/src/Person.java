
import java.util.Date;

public class Person {
	private String name;
	private String address;
	private String phoneNum;
	private String email;

	public Person() {

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public String getPhoneNum() {
		return this.phoneNum;
	}

	public String getEmail() {
		return this.email;
	}

	public String toString() {
		String s = this.getName() + " - " + this.getAddress() + " - " + this.getPhoneNum() + " - " + this.getEmail();
		return s;
	}

	public class Student {
		public static final int FRESHMAN = 1;
		public static final int SOPHOMORE = 2;
		public static final int JUNIOR = 3;
		public static final int SENIOR = 4;
		protected int status;

		public Student() {
			this.status = FRESHMAN;
		}

		public void setStatus(int status) {
			this.status = status;
		}

		public int getStatus() {
			return this.status;
		}

		public String toString() {
			String s = null;
			switch (this.status) {
			case FRESHMAN:
				s = "FRESHMAN";
				break;
			case SOPHOMORE:
				s = "SOPHOMORE";
				break;
			case JUNIOR:
				s = "JUNIOR";
				break;
			case SENIOR:
				s = "SENIOR";
				break;
			}

			return s;
		}

	}

	public class Employee {
		protected String office;
		protected double salary; // in thousands of $
		protected Date startDate;

		public Employee() {
			this.office = "HUST";
			this.salary = 1.3;
			this.startDate = new Date();
		}

		public void setOffice(String office) {
			this.office = office;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}

		public String getOffice() {
			return this.office;
		}

		public double getSalary() {
			return this.salary;
		}

		public Date getStartDate() {
			return this.startDate;
		}

		public String toString() {
			String s = this.getOffice() + " - " + this.getSalary() + " - " + this.getStartDate();
			return s;
		}

		public class Lecturer {
			protected String title;
			protected double officeHours;

			public Lecturer() {
				this.title = "";
				this.officeHours = 332.1;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public void setOfficeHours(double officeHours) {
				this.officeHours = officeHours;
			}

			public String getTitle() {
				return this.title;
			}

			public double getOfficeHours() {
				return this.officeHours;
			}

			public String toString() {
				String s = this.title + " - " + this.officeHours;
				return s;
			}
		}

		public class Staff {
			protected String rank;

			public Staff() {
				this.rank = "Administrative";
			}

			public void setRank(String rank) {
				this.rank = rank;
			}

			public String getRank() {
				return this.rank;
			}

			public String toString() {
				return this.rank;
			}
		}

	}

	public static void main(String arg[]) {
		Person p = new Person();
		
	}
}
