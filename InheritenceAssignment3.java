package oops.inheritance;

//Parent class/super class
class Person {
	private String name;
	private int dateOfBirth;

	// parameterize constructor
	public Person(String name, int dateOfBirth) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	// getter method
	public String getName() {
		return name;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	void getData() {
		System.out.println("PersonName:" + this.getName() + " " + " DateOfBirth:" + this.getDateOfBirth());
	}

}// End of class person

//child class
class Teacher extends Person {

	private int salary;
	private String subject;

	public Teacher(String name, int dateOfBirth, int salary, String subject) {
		super(name, dateOfBirth);
		this.salary = salary;
		this.subject = subject;

	}

	// getter method
	public int getSalary() {
		return salary;
	}

	public String getSubject() {
		return subject;
	}

	void getData() {
		System.out.println("TeacherName:" + this.getName() + " " + " DateOfBirth:" + this.getDateOfBirth() + " "
				+ " Salary:" + this.getSalary() + " " + " Subject:" + " " + this.getSubject());
	}

}

//child class
class Student1 extends Person {

	private int studenId;

	public Student1(String name, int dateOfBirth, int studenId) {
		super(name, dateOfBirth);
		this.studenId = studenId;
	}

	// getter method
	public int getStudenId() {
		return studenId;
	}

	void getData() {
		System.out.println("StudentName:" + this.getName() + " " + " DateOfBirth:" + this.getDateOfBirth() + " "
				+ " StudentId:" + this.getStudenId());
	}

}

//child class of Student1
class CollegeStudent extends Student1 {

	private String collegeName;
	private String year;

	public CollegeStudent(String name, int dateOfBirth, int studenId, String collegeName, String year) {
		super(name, dateOfBirth, studenId);
		this.collegeName = collegeName;
		this.year = year;
	}

	// getter method
	public String getCollegeName() {
		return collegeName;
	}

	public String getYear() {
		return year;
	}

	void getData() {
		System.out.println("CollegeStudentName:" + this.getName() + " " + " DateOfBirth:" + this.getDateOfBirth() + " "
				+ " StudentId:" + this.getStudenId() + " " + " collegeName:" + this.getCollegeName() + " " + " Year:"
				+ this.getYear());
	}

}

public class InheritenceAssignment3 {

	public static void main(String[] args) {
		Person person = new Person("Akash", 2000);
		person.getData();// invoking

		Teacher teacher = new Teacher("Rahul", 1999, 40000, "Maths");
		teacher.getData();// invoking

		Student1 student = new Student1("Priyanshu", 2002, 121);
		student.getData();// invoking

		CollegeStudent collegeStudent = new CollegeStudent("Rocky", 2001, 110, "IEM", "Third year");
		collegeStudent.getData();// invoking

	}

}
