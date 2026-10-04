package Com.Kodewala.Student;

import Com.Amazon.Product.Product;

public class Student {
	String studentId;
	String studentName;
	String studentRollNo;
	String studentBranch;
	int studentBatch;
	int studentMarks;

	Student(String _studentId, String _studentName, String _studentRollNo, String studentBranch, int _studentBatch String _studentMarks){
		this.studentId =_studentId;
		this.studentName =_studentName;
		this.studentRollNo = _studentRollNo;
		this.studentBranch = _studentBranch;
		this.studentBatch =_studentBatch;
		this.studentMarks = _studentMarks;
		
	}

}

	class StudentDetails {
		public static void main(String[] args) {
			StudentDetails student = new StudentDetails("101", "Mohit", "98", "CSE", 2026, 97);

			StudentDetails student1 = new StudentDetails("102", "Raman", "79", "ME", 2025, 90);

			StudentDetails student2 = new StudentDetails("103", "Aman", "90", "ECE", 2025, 89);

			StudentDetails student2 = new StudentDetails("104", "Kodewala", "56", "CSE", 2023, 65);

			StudentDetails student2 = new StudentDetails("105", "Mannat", "86", "EE", 2022, 98);

			StudentDetails student2 = new StudentDetails("106", "Sourabh", "70", "CSE", 2026, 93);

		}
	}


   
	