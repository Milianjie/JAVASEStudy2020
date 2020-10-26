package v¾ÛºÏ¹ØÏµ;

import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		Classroom classroom = new Classroom(1602052);
		Student student = new Student(classroom);
		System.out.println(student.classroom.classid);
		
	//	Classroom classroom1 = new Classroom((List<Student>) new Student("hshfgjha"));
		Student student1 = new Student("hshfgjha");
		System.out.println(student1.name);
		//System.out.println(classroom1.student1.classid);
	}

}
