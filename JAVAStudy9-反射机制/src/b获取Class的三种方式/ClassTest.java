package b获取Class的三种方式;

import java.util.Date;

/*
 * 	要操作一个字节码文件，需要先获取这个类的字节码文件
 * 	【获取java.lang.Class实例有三种方法】
 * 		第一种：static Class<?> forName(String className) --返回与带有给定字符串名的类或接口相关联的 Class 对象。 
 * 				Class c = Class.forName("完整的类名带包名");
 * 		
 * 		第二种：Class<?> getClass() --返回此 Object 的运行时类。 
 * 				Class c = 对象.getClass();
 * 
 * 		第三种：Class c = 任何类型.class;
 */

public class ClassTest {
	
	public static void main(String[] args) {
		
		/*
		 * Class.forName()
		 * 1、这是一个静态方法
		 * 2、方法的参数是一个字符串，该字符串必须是一个完整的类名，即带有包名，java.lang不能省
		 */
		Class class1 = null;//局部变量，要显示的赋值，虽然try语句块中有赋值，但可能报异常而赋值不成功，下面就不能用这个变量了
		try {
			class1 = Class.forName("java.lang.String");//class1代表String.class文件，或者说class1是String类型
			Class class2 = Class.forName("java.util.Date");//class2是Date
			Class class3 = Class.forName("java.lang.Integer");//class3是Integer类型
			Class class4 = Class.forName("java.lang.System");//class4是System类型
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		/*
		 * java中的任何一个对象都有一个方法：getClass()
		 * 因为该方法是Object中的，Object类是所有类的父类
		 */
		String string = "abc";
		Class class5 = string.getClass();//class5代表String.class字节码文件，是String类型
		
		System.out.println(class1 == class5);//true  -->JVM在方法区中只提供一份String.class字节码文件，所以它们指向的是同一份
		
		/*
		 * java语言中任何一种类型，包括基本数据类型，都有.class属性
		 */
		Class class6 = String.class;
		Class class7 = Date.class;
		Class class8 = Integer.class;
		Class class9 = int.class;
		System.out.println(class1 == class6);//true
		
	}

}
