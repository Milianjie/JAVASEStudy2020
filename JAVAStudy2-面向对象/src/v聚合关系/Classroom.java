/*
 *   Classroom是整体
 */
package v聚合关系;

import java.util.List;

public class Classroom {
	
	int classid;
	
	//Classroom和List集合属于关联关系，在同一层级上
	//Classroom与Student属于聚合关系，一个是整体，一个是部分
	//List<Student>表示学生的集合，有很多学生
	List<Student> stus;//每一个Student就是部分
	
	//聚合关系：整体不依赖部分，部分也不依赖整体
	//整体无法决定部分的生命周期
	
	public Classroom(List<Student> s) {
		// TODO 自动生成的构造函数存根
		this.stus=s;
	}
	public Classroom(int id) {
		// TODO 自动生成的构造函数存根
		this.classid=id;
	}

}
/**
class Person{
	
	//人和List是关联关系
	//人和四肢是合成关系，人是整体，四肢是部分
	//合成关系和聚合关系是相似的
	//区别的地方：整体和部分是紧密相连的，整体的生命周期决定部分的生命周期
	List<Hands> s;
}
*/