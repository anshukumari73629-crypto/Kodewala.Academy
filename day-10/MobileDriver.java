class EmployeeMgmt
{
private int salary = 100000;
public void showEmployee(String name)
{
EmployeeMgmt obj = new EmployeeMgmt();

System.out.println("Salary : " +obj.salary);
System.out.println("Employee : " + name);
}
}
class EmployeeDriver 
{
public static void main(String args[])
{
EmployeeMgmt obj = new EmployeeMgmt();
obj.showEmployee("Rani");
}
}