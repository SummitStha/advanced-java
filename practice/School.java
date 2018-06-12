abstract class Person{
	String firstName, lastName;
	int age;
	Person(String fn, String ln, int a){
		firstName = fn;
		lastName = ln;
		age = a;
	}
	abstract void showInfo();
}


class Student extends Person{
	String faculty;
	Student(String fn, String ln, int a, String f){
		super(fn, ln, a);
		faculty = f;
	}
	void showInfo(){
		System.out.println("First Name:" + "" + firstName);
		System.out.println("Last Name:" + "" + lastName);
		System.out.println("Age:" + "" + age);
		System.out.println("Faculty:" + "" + faculty);
	}
}


class Teacher extends Person{
	double salary;
	Teacher(String fn, String ln, int a, double s){
		super(fn, ln, a);
		salary = s;
	}
	void showInfo(){
		System.out.println("First Name:" + "" + firstName);
		System.out.println("Last Name:" + "" + lastName);
		System.out.println("Age:" + "" + age);
		System.out.println("Salary:" + "" + salary);
	}
}

public class School{
	public static void main(String[] args){
		Student s = new Student("Summit", "Shrestha", 21, "BSc.CSIT");
		s.showInfo();
		Teacher t = new Teacher("Aashish", "Gurung", 22, 100000);
		t.showInfo();
	}
}