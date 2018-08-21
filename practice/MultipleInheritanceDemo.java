interface College
{
	String col_name = "New Summit";
	void showInfo();
}

class Student
{
	String name, faculty;
	Student(String n, String f){
		name = n;
		faculty = f;
	}
}

class StudentDetail extends Student implements College
{
	StudentDetail(String n, String f){
		super(n,f);
	}
	public void showInfo(){
		System.out.println("Student Name: " + name);
		System.out.println("Faculty: " + faculty);
		System.out.println("College Name: " + col_name);
	}
}
	
public class MultipleInheritanceDemo
{
	public static void main(String[] args) {
		StudentDetail sd = new StudentDetail("Summit", "CSIT");
		sd.showInfo();
	}
}
