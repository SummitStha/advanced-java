class Student{
	private int id;
	private String name;
	private String faculty;

	public void setId(int id){
		this.id = id;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setFaculty(String faculty){
		this.faculty = faculty;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getFaculty(){
		return faculty;
	}
}

public class StudentInfo{
	public static void main(String[] args){
		Student s[] = new Student[3];
		s[0] = new Student();
		s[1] = new Student();
		s[2] = new Student();
		s[0].setId(1);
		s[0].setName("Dhanchha");
		s[0].setFaculty("CSIT");
		System.out.println(s[0].getId());
		System.out.println(s[0].getName());
		System.out.println(s[0].getFaculty());
		s[1].setId(2);
		s[1].setName("Suman");
		s[1].setFaculty("BIM");
		System.out.println(s[1].getId());
		System.out.println(s[1].getName());
		System.out.println(s[1].getFaculty());
		s[2].setId(3);
		s[2].setName("Baruwal");
		s[2].setFaculty("BBS");
		System.out.println(s[2].getId());
		System.out.println(s[2].getName());
		System.out.println(s[2].getFaculty());
	}
}