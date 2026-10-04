package Com.School.Student;
class StudentDetail {

String name;
int age;
String course;
int marks;
 StudentDetail() {
	System.out.println("inside 0 args StudentDetail");
 }
 StudentDetail(String _name,int _age, String _course ,int _marks){
this.name = _name;
this.age = _age;
this.course=_course;
this.marks= _marks;
}
}
