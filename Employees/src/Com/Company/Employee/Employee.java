package Com.Company.Employee;

class Employee {
	String name;
	int salary;
	String department;
	int experience;

	Employee() {
		System.out.println("inside 0 args Constructor");

	}

	Employee(String _name, int _salary, String _department, int _experience) {
		this.name = _name;
		this.department = _department;
		this.salary = _salary;
		this.experience = _experience;
	}

}
