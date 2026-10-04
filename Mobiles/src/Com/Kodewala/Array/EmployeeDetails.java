package Com.Kodewala.Array;

public class EmployeeDetails {
	public static void main(String[] args) {
		Employee employee = new Employee("Aarav",  70000, 26);
		Employee employee1 = new Employee("Ananya", 87000, 26);
		Employee employee2 = new Employee("Sagar", 74000, 26);
		Employee employee3 = new Employee("Abhishek", 55000, 26);
		Employee employee4 = new Employee("Manav", 80000, 26);
		Employee employee5 = new Employee("Mohit", 25000, 26);
		Employee employee6 = new Employee("Subhansh", 50000, 26);
		
		Employee employees[] = new Employee[6];
		
		employees[0]= employee1;
		employees[1]= employee2;
		employees[2]= employee3;
		employees[3]= employee4;
		employees[4]= employee5;
		employees[5]= employee6;
		
		
		for(int i = 0; i < 7; i++) {
			System.out.println("Employee index: " +i);
		}
	}


}
