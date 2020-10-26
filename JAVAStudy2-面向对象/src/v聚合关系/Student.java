package v聚合关系;

public class Student {
	
	String name;
	int id;
	Classroom classroom ;
	
	public Student(Classroom classroom) {
		// TODO 自动生成的构造函数存根
		this.classroom=classroom;
	}
	
	public Student(String name) {
		// TODO 自动生成的构造函数存根
		this.name=name;
	}

}
