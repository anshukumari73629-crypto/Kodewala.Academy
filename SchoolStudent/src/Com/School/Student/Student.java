package Com.School.Student;

class Student {
public static void main(String[] args) {
 StudentDetail student= new StudentDetail("rani",23,"java Backend",43);
	System.out.println(student.name+" "+ student.age+" "+student.course+" "+student.marks); 		
			StudentDetail student1 = new StudentDetail("amit",26,"python",90);
	//System.out.println(student1.name + " "+student1.course);
	
	//Student student2 = new Student("Amit", 22, "Python", 56);
	//System.out.println(student2.name+" "+student2.age + " "+student2.course+" "+student2.marks);

}
}