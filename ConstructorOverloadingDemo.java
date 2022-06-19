package oops.polymorphism;

class Employee {
	int empId;
	String empName, empAdd;
	long phno;
	double salary;
	String city, country;

// constructor chaining
	// constructor to initialize id,name,add
	public Employee(int empId, String empName, String empAdd) {
		this.empId = empId;
		this.empName = empName;
		this.empAdd = empAdd;
	}

	// constructor to initialize id,name,add,phno,salary
	public Employee(int empId, String empName, String empAdd, long phno, double salary) {
		this(empId, empName, empAdd);
		this.phno = phno;
		this.salary = salary;
	}

	// constructor to initialize id,name,add,phno,salary,city,country
	public Employee(int empId, String empName, String empAdd, long phno, double salary, String city, String country) {
		this(empId, empName, empAdd, phno, salary);
		this.city = city;
		this.country = country;
	}

	// getter method
	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpAdd() {
		return empAdd;
	}

	public long getPhno() {
		return phno;
	}

	public double getSalary() {
		return salary;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}
}// end class

public class ConstructorOverloadingDemo {

	public static void main(String[] args) {
		Employee employee1 = new Employee(700, " Mohit", "Kolkata");
		System.out.println(employee1.getEmpId() + employee1.empName + " " + employee1.getEmpAdd());

		Employee employee2 = new Employee(124, " Anuj", "Kolkata ", 348964554, 20000);
		System.out.println(employee2.getEmpId() + employee2.empName + " " + employee2.getEmpAdd() + employee2.phno + " "
				+ employee2.salary);

		Employee employee3 = new Employee(524, " Kartik", "banglore ", 2345631, 30000, " banglore", "India");
		System.out.println(employee3.getEmpId() + employee3.empName + " " + employee3.getEmpAdd() + employee3.phno + " "
				+ employee3.salary + employee3.city + " " + employee3.country);

	}

}
