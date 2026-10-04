package Com.Kodewala.Array;

public class StudentDetails {
	public static void main(String[] args) {
		Student student1 = new Student("Sourabh", 24, 90);
		Student student2 = new Student("Amit", 24, 97);
		Student student3 = new Student("Neha", 24, 88);
		Student student4 = new Student("pooja", 24, 98);
		Student student5 = new Student("Aarav", 24, 87 );		
		Student student6 = new Student("Ananaya", 20, 99);
		
		Student student[] = new Student[6];
		
		student[0]= student1;
		student[1]=  student2;
		student[2]= student3;
		student[3]= student4;
		student[4]= student5;
		student[5]= student6;
		
		for (int i = 0; i < 6; i++) {
			System.out.println("Student number:"+i);
		}
	}
}
