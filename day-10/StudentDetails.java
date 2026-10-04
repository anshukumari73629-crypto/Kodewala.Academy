class StudentDetails 
{
public static void main(String args[])
{
System.out.println("Starting main()");
boolean result= StudentDetails.checkStudent("Anshu","CSE","B.Tech");
boolean result1= StudentDetails.checkStudent("Rani","ME","B.Tech");
boolean result2= StudentDetails.checkStudent("Ram","ECE","B.Tech");
boolean result3= StudentDetails.checkStudent("Rahul","EE","B.Tech");
boolean result4= StudentDetails.checkStudent("Amit","CSE","B.Tech");
}
static boolean checkStudent(String name,String branch,String cource)
{
System.out.println("Entered checkStudent");
System.out.println("Input Recived "+ "name" + "branch" + "course");
System.out.println("Exit checkStudent");

return true;
}
}