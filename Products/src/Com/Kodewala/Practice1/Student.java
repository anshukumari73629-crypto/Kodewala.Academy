package Com.Kodewala.Practice1;

public class Student {
	String name;
	int age;
	String marks;

	public Student(String name, int age, String marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

}
 class StudentInfo {
	void display(Student student) {
		System.out.println("Name: + student.name");
		System.out.println("Age: "+ student.age);
	}
 }
 
 class Driver {
	 public static void main(String[] args) {
		 
		Student student = new Student("Aman", 23, "90");
		
		StudentInfo info = new StudentInfo ();
		info.display(student);
	 }
 
	}
 