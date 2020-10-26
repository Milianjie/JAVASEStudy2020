/*
 *     对象如何创建，又如何使用
 *     
 */
package b对象的建立和使用;

class Student {
	
	//属性:
	//学号
	int id;//成员变量，实例变量
			//id是对象级别的，必须先有对象才能访问，不能使用类直接访问
	//姓名
	String name;
	//性别
	boolean sex;
	//年龄
	int age;
	//住址
	String addr;
	
	
	//方法:
	

}

public class Test01 {
	
	public static void main(String[] args){
		
		//1.创建对象
		//stu1是一个局部变量，这个局部变量stu1是Student类型，也就是一个引用类型
		Student stu1 = new Student();//关键字new作用就是在JVM的堆(heap)内存中开辟一块Student类型的空间
		                           //其空间中有对象，而stu1存储的是对象的内存地址，stu1称：引用
									//通过“引用”间接访问堆中的对象
		//一个类可以创建多个变量
		//Student stu2 = new Student();
		
		//2.使用对象
		//访问成员变量(实例变量、非静态变量)，必须使用"引用."
		
		//name是成员变量，对象相关，必须现有对象才能访问，须使用"引用."
		//ERROR ：System.out.println(Student.name);
		
		//读取过程
		System.out.println("id="+stu1.id);//0
		System.out.println("name="+stu1.name);//null
		System.out.println("age="+stu1.age);//0
		System.out.println("sex="+(stu1.sex?"男":"女"));//false
		
		/*
		 * 关于系统默认值
		 *              基本数据类型
		 *              byte short int long   0
		 *              float double   0.0
		 *              boolean    false
		 *              char    \u0000
		 *              
		 *              引用数据类型   null
		 */
		//赋值过程
		
		stu1.id=5664;
		stu1.name="ksjdkjs";
		stu1.age=54516;//虽然程序编译通过，但不符合现实的业务逻辑
		stu1.sex=true;
		
		//读取过程
				System.out.println("id="+stu1.id);//5664
				System.out.println("name="+stu1.name);//ksjdkjs
				System.out.println("age="+stu1.age);//54516
				System.out.println("sex="+(stu1.sex?"男":"女"));//true
				
				
		
	}

}
